/*
 * Copyright (c) 2017, salesforce.com, inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided
 * that the following conditions are met:
 *
 *    Redistributions of source code must retain the above copyright notice, this list of conditions and the
 *    following disclaimer.
 *
 *    Redistributions in binary form must reproduce the above copyright notice, this list of conditions and
 *    the following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 *    Neither the name of salesforce.com, inc. nor the names of its contributors may be used to endorse or
 *    promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
 * TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package com.sforce.ws.transport;

import com.sforce.ws.ConnectorConfig;
import com.sforce.ws.MessageHandler;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.Iterator;

public class MessageHandlerOutputStream extends OutputStream {
    private final ByteArrayOutputStream bout = new ByteArrayOutputStream();
    private final OutputStream output;
	private final URL url;
	private final ConnectorConfig config;

    public MessageHandlerOutputStream(ConnectorConfig config, URL url, OutputStream output) {
    	this.url = url;
        this.output = output;
        this.config = config;
    }

    @Override
    public void write(int b) throws IOException {
        bout.write((char) b);
        output.write(b);
    }

    @Override
    public void write(byte b[]) throws IOException {
        bout.write(b);
        output.write(b);
    }

    @Override
    public void write(byte b[], int off, int len) throws IOException {
        bout.write(b, off, len);
        output.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        bout.close();
        output.close();

        Iterator<MessageHandler> it = config.getMessagerHandlers();

        while(it.hasNext()) {
            MessageHandler handler = it.next();
            handler.handleRequest(url, bout.toByteArray());
        }
    }
}
