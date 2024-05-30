module edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model.cliproduct {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model.cliproduct to javafx.fxml;
    exports edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model.cliproduct;
}