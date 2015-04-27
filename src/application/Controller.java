package application;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;


public class Controller {
	
    @FXML
    private ComboBox<?> Month;

    @FXML
    private ComboBox<?> Day;

    @FXML
    private ComboBox<?> Year;
    
    @FXML
    void initialize() {
        Month.getItems().add("January" , "February","March","April","May","June","July","August","September","October","November","December");
        Day.getItems().add(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31);
        Year.getItems().add(2016,2015,2014,2013,2012,2011,2010,2009,2008,2007,2006,2005,2004,2003,2002,2001,2000,1999,1998,1997,1996,1995,1994,1993);

    }

    	
    }

