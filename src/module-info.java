module org.db {
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;

    requires java.xml.ws;
    requires java.xml.bind;
    requires java.jws;

    requires org.apache.commons.lang3;
    requires java.desktop;
    requires commons.beanutils;
    requires ST4;
    requires appengine.api;
    requires poi;
    requires transitive java.logging;

    requires AgileAPI;
    opens com.agile.ws.schema.project.v1.jaxws;
    opens com.agile.ws.schema.search.v1.jaxws;
    opens com.agile.ws.schema.collaboration.v1.jaxws;
    opens com.agile.ws.schema.table.v1.jaxws;
    opens com.agile.ws.schema.common.v1.jaxws;
    opens com.agile.ws.schema.attachment.v1.jaxws;
    opens com.agile.ws.schema.metadata.v1.jaxws;
    opens com.agile.ws.schema.business.v1.jaxws;

    opens org.db to javafx.graphics, javafx.fxml;
    exports org.db;
    exports com.sun.activation.registries to jakarta.activation;



}