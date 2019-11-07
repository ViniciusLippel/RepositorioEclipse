package javafxbasic;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class FXMLDocumentController implements Initializable{
        
    private final ObservableList<Marca> data =
        FXCollections.observableArrayList();   
        
    public FXMLDocumentController() {
        System.out.println("Construtor FXMLController");
        
    }
    
       

    @FXML
    private Button salvar;

    @FXML
    private Label label;

    @FXML
    private TextField codigo;

    @FXML
    private TextField descricao;

    @FXML
    private Button limpar;

    @FXML
    private TableView<Marca> tabela;
    
    
    @Override
    public void initialize(URL url, ResourceBundle bundle) {
        TableColumn codigoT = new TableColumn("Codigo");
        TableColumn descricaoT = new TableColumn("Descricao");
        codigoT.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        descricaoT.setCellValueFactory(new PropertyValueFactory<>("descricao"));
        tabela.setItems(data);
        tabela.getColumns().addAll(codigoT, descricaoT);
    }
    
    @FXML
    void limpar(ActionEvent event) {
        codigo.setText("");
        descricao.setText("");
        codigo.requestFocus();
    }

    @FXML
    void salvar(ActionEvent event) {
         data.add(new Marca(Integer.parseInt(codigo.getText()),descricao.getText()));
         this.limpar(event);
    }

    

}
