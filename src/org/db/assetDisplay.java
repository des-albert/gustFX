package org.db;

import javafx.beans.property.SimpleStringProperty;

public class assetDisplay {
    private final SimpleStringProperty asAsset;
    private final SimpleStringProperty asProduct;
    private final SimpleStringProperty asModel;

    assetDisplay(String asset) {
        asAsset = new SimpleStringProperty(asset);
        asProduct = new SimpleStringProperty("");
        asModel = new SimpleStringProperty("");
    }

    assetDisplay(String asset, String product, String model) {

        asAsset = new SimpleStringProperty(asset);
        asProduct = new SimpleStringProperty(product);
        asModel= new SimpleStringProperty(model);
    }
    public String getAsAsset () {return asAsset.get();}
    public String getAsProduct () {return asProduct.get();}
    public String getAsModel () {return asModel.get();}

}
