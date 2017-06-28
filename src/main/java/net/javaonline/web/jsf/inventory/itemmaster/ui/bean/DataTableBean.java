package net.javaonline.web.jsf.inventory.itemmaster.ui.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.CustomScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;

import org.icefaces.ace.component.datatable.DataTable;
import org.icefaces.ace.event.RowEditEvent;


@ManagedBean(name= DataTableBean.BEAN_NAME)
@CustomScoped(value = "#{window}")
public class DataTableBean implements Serializable {

	private static final long serialVersionUID = 1L;
	public static final String BEAN_NAME = "dataTableBean";
    public String getBeanName() { return BEAN_NAME; }
    
    private List<Car> carsData;
    /////////////---- CONSTRUCTOR BEGIN
    public DataTableBean() {
        carsData = new ArrayList<Car>(DataTableData.getDefaultData());
    }

    /////////////---- GETTERS & SETTERS BEGIN
    public List<Car> getCarsData() { return carsData; }
    public void setCarsData(List<Car> carsData) { this.carsData = carsData; }
    
    public void onRowEdit(AjaxBehaviorEvent event) {
    	/*
    	//Car car = (Car)((DataTable) event.getSource()).getValue();
        FacesMessage msg = new FacesMessage("Car Edited"+car.getId());
        System.out.println("ID"+car.getId());
        System.out.println("name"+car.getName());
        System.out.println("chassis"+car.getChassis());
        System.out.println("W"+car.getWeight());
        FacesContext.getCurrentInstance().addMessage(null, msg);*/
    }
}