package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import model.Employee;
import model.Part;
import rmi.RmiClient;

/**
 * The actions for every button on the interface. 
 * @author Bogdan
 *
 */
public class ButtonHandler implements ActionListener {

	private MainGUI gui;
	private RmiClient client;
	private final String MANAGER="manager";
	private final String EMPLOYEE="employee";

	/**
	 * Constructor gives access to the guy and to the RmiClient class
	 * @param gui
	 * @param client
	 */
	public ButtonHandler(MainGUI gui, RmiClient client) {
		this.gui = gui;
		this.client = client;

	}

	/*
	 * All the actions performed by the buttons Create part, Edit part, Create
	 * employee, Edit employee, Create location, Edit location, Login, Logout,
	 * Search Part, Search Employee, Search Location (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent e) {

		// /////////////////
		// //CreatePanel////
		// /////////////////
		if (e.getSource() == gui.getCreatePanel().getBtnCreatePart()) {
			
			if(!gui.getCreatePanel().getTxfPartId().getText().equals("")||
					!gui.getCreatePanel().getTxfPartName().getText().equals("")|| !gui
					.getCreatePanel().getTxfMake().getText().equals("")||
			!gui.getCreatePanel().getTxfDescription().getText().equals("")|| !gui
					.getCreatePanel().getTxfCategory().getText().equals("")||
			!gui.getCreatePanel().getTxfNrOfParts().getText().equals("")|| !gui
					.getCreatePanel().getTxfShelf().getText().equals("")|| !gui
					.getCreatePanel().getTxfBox().getText().equals("")){
			try {
				client.addPart(gui.getCreatePanel().getTxfPartId().getText(),
						gui.getCreatePanel().getTxfPartName().getText(), gui
								.getCreatePanel().getTxfMake().getText(),
						gui.getCreatePanel().getTxfDescription().getText(), gui
								.getCreatePanel().getTxfCategory().getText(),
						gui.getCreatePanel().getTxfNrOfParts().getText(), gui
								.getCreatePanel().getTxfShelf().getText(), gui
								.getCreatePanel().getTxfBox().getText());
				
				gui.getCreatePanel().getTxfPartId().setText("");
				gui.getCreatePanel().getTxfPartName().setText("");
				gui.getCreatePanel().getTxfMake().setText("");
				gui.getCreatePanel().getTxfDescription().setText("");
				gui.getCreatePanel().getTxfCategory().setText("");
				gui.getCreatePanel().getTxfNrOfParts().setText("");
				gui.getCreatePanel().getTxfShelf().setText("");
				gui.getCreatePanel().getTxfBox().setText("");
				
				gui.popUp("Part added successfull");
			} catch (RemoteException e1) {
				e1.printStackTrace();
				gui.popUp("Something went wrong");
			}
			catch (Exception e2){
				e2.printStackTrace();
				gui.popUp(e2.getMessage());
			}
			}
			else gui.popUp("Please fill all the part fields");
		}

		else if (e.getSource() == gui.getCreatePanel().getBtnCreateEmployee()) {
			
			if(DataCheck.CheckSSN(gui.getCreatePanel().getTxfSSN().getText(), gui)&&DataCheck.CheckSSN( gui
								.getCreatePanel().getTxfMngSSn().getText(), gui)){
			
			try {
				client.addEmployeeWithUser(gui.getCreatePanel().getTxfName()
						.getText(), gui.getCreatePanel().getTxfSSN().getText(),
						gui.getCreatePanel().getTxfPhoneNr().getText(), gui
								.getCreatePanel().getTxfMngSSn().getText(), gui
								.getCreatePanel().getTxfUsername().getText(),
						gui.getCreatePanel().getTxfPassword().getText());
				
				gui.getCreatePanel().getTxfName().setText("");
				gui.getCreatePanel().getTxfSSN().setText("");
				gui.getCreatePanel().getTxfPhoneNr().setText("");
				gui.getCreatePanel().getTxfMngSSn().setText("");
				gui.getCreatePanel().getTxfUsername().setText("");
				gui.getCreatePanel().getTxfPassword().setText("");
				
				
				gui.popUp("Employee added successfully");
			} catch (RemoteException e1) {
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				gui.popUp(e1.getMessage());
			}
				
			}
		}

		else if (e.getSource() == gui.getCreatePanel().getBtnCreateLocation()) {
			if(!gui.getCreatePanel().getTxfShelfNr()
					.getText().equals("")||!gui.getCreatePanel().getTxfBoxNr()
					.getText().equals("")){
			try {
				client.addLocation(gui.getCreatePanel().getTxfShelfNr()
						.getText(), gui.getCreatePanel().getTxfBoxNr()
						.getText());
				gui.getCreatePanel().getTxfShelfNr().setText("");
				gui.getCreatePanel().getTxfBoxNr().setText("");
				gui.popUp("Location created successfully");
			} catch (RemoteException e1) {
				e1.printStackTrace();
				gui.popUp("Something went wrong");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				gui.popUp(e1.getMessage());
			}
			}
			else gui.popUp("Please fill the location fields");

		}
		// /////////////////
		// //EditPanel/////
		// /////////////////
		
		
		//Search Employee
		else if (e.getSource() == gui.getEditPanel().getBtnSearchEmployee()) {

			// needs a check if the ssn is correct or if it is complete
			gui.hideEditPart();
			gui.hideEditLocation();
//			gui.getEditPanel().getTxfSSN().setText("");
//			gui.getEditPanel().getTxfName().setText("");
//			gui.getEditPanel().getTxfPhoneNr().setText("");
//			gui.getEditPanel().getTxfMngSSn().setText("");
//			gui.getEditPanel().getTxfUsername().setText("");
//			gui.getEditPanel().getTxfPassword().setText("");
			String temp= gui.getEditPanel().getTxfSearchEmployee().getText();
			try {
				if(DataCheck.CheckSSN(temp, gui)&&client.getEmployeeBySSN(Long.parseLong(temp))!=null)	{
					gui.showEditEmployee();
					gui.getEditPanel().getTxfSSN().setText(client.getEmployeeBySSN(Long.parseLong(temp)).getSsn()+"");
					gui.getEditPanel().getTxfName().setText(client.getEmployeeBySSN(Long.parseLong(temp)).getName()+"");
					gui.getEditPanel().getTxfPhoneNr().setText(client.getEmployeeBySSN(Long.parseLong(temp)).getPhoneNr()+"");
					gui.getEditPanel().getTxfMngSSn().setText(client.getEmployeeBySSN(Long.parseLong(temp)).getMngrSSN()+"");
					gui.getEditPanel().getTxfUsername().setText(client.getEmployeeBySSN(Long.parseLong(temp)).getUsername()+"");
					gui.getEditPanel().getTxfPassword().setText(client.getEmployeeBySSN(Long.parseLong(temp)).getPassword()+"");
				}
				else {
					gui.hideEditEmployee();
					gui.popUp("Could not find employee or manager by SSN");
				}
			} catch (IllegalArgumentException | RemoteException | SQLException e1) {
				e1.printStackTrace();
				 gui.popUp("Please insert a valid employee SSN");
			}

			///Search Location
		} else if (e.getSource() == gui.getEditPanel().getBtnSearchLocation()) {
			gui.hideEditEmployee();
			gui.hideEditPart();
			
			try {
				
				String tempBox=gui.getEditPanel().getTxfSearchLocationBox().getText();
				String tempShelf=gui.getEditPanel().getTxfSearchLocationShelf().getText();
				
				int tempBoxInt=0;
				int tempShelfInt=0;
				try{
					tempBoxInt = Integer.parseInt(tempBox);
					tempShelfInt = Integer.parseInt(tempShelf);
				}
				catch(Exception e2){
					throw new Exception("Please fill in the fields with valid data");
				}


				
				if(client.getLocationByShelfAndBox(tempShelfInt,tempBoxInt)!= null){
					gui.showEditLocation();
				
					gui.getEditPanel().getTxfShelfNr().setText(client.getLocationByShelfAndBox(tempShelfInt,tempBoxInt).getShelfNr()+"");
					gui.getEditPanel().getTxfBoxNr().setText(client.getLocationByShelfAndBox(tempShelfInt,tempBoxInt).getBox()+"");
					Part tempPart= client.getPartByLocation(client.getLocationByShelfAndBox(tempShelfInt,tempBoxInt));
					gui.getEditPanel().getTxfLocationNrOfParts().setText(tempPart.getNrOfParts()+"");
					gui.getEditPanel().getTxfLocationPartId().setText(tempPart.getPartID()+"");
				}
				else gui.popUp("Specified location does not exist");
			} catch (IllegalArgumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			catch (NullPointerException e1) {
				e1.printStackTrace();
				gui.popUp("Please fill in the location fields");
			}
			catch(Exception e1){
				e1.printStackTrace();
				gui.popUp(e1.getMessage());
			}
			
			////Search part
		} else if (e.getSource() == gui.getEditPanel().getBtnSearchPart()) {
			
			try {
				gui.hideEditEmployee();
				gui.hideEditLocation();
				int partid =  Integer.parseInt(gui.getEditPanel().getTxfSearchPart().getText());
				if(client.getPartById(partid)!= null){
				gui.showEditPart();
				gui.getEditPanel().getTxfPartId().setText(client.getPartById(partid).getPartID()+"");
				gui.getEditPanel().getTxfShelf().setText(client.getPartById(partid).getShelfNr()+"");
				gui.getEditPanel().getTxfBox().setText(client.getPartById(partid).getBox()+"");
				gui.getEditPanel().getTxfPartName().setText(client.getPartById(partid).getName());
				gui.getEditPanel().getTxfMake().setText(client.getPartById(partid).getMake());
				gui.getEditPanel().getTxfDescription().setText(client.getPartById(partid).getDescription());
				gui.getEditPanel().getTxfCategory().setText(client.getPartById(partid).getCategory());
				gui.getEditPanel().getTxfNrOfParts().setText(client.getPartById(partid).getNrOfParts()+"");
				}
				else gui.popUp("Searched part does not exist");
			} catch (IllegalArgumentException | RemoteException | SQLException e1) {
				e1.printStackTrace();
				 gui.popUp("Please insert a valid part Id");
			}
			
			
			/////////Update employee
		} else if (e.getSource() == gui.getEditPanel().getBtnSaveEmployee()) {
			if(DataCheck.CheckSSN(gui.getEditPanel().getTxfSSN().getText(), gui)&&DataCheck.CheckSSN( gui
					.getEditPanel().getTxfMngSSn().getText(), gui)){
			try {
				client.updateEmployeeWithUser(gui.getEditPanel().getTxfName()
						.getText(), gui.getEditPanel().getTxfSSN().getText(),
						gui.getEditPanel().getTxfPhoneNr().getText(), gui
						.getEditPanel().getTxfMngSSn().getText(), gui
						.getEditPanel().getTxfUsername().getText(),
						gui.getEditPanel().getTxfPassword().getText());
				
				gui.getEditPanel().getTxfName().setText("");
				gui.getEditPanel().getTxfSSN().setText("");
				gui.getEditPanel().getTxfPhoneNr().setText("");
				gui.getEditPanel().getTxfMngSSn().setText("");
				gui.getEditPanel().getTxfUsername().setText("");
				gui.getEditPanel().getTxfPassword().setText("");
				
				
				gui.popUp("Employee updated successfully");
			} catch (RemoteException e1) {
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				gui.popUp(e1.getMessage());
			}
			}

			///Update Location
		} else if (e.getSource() == gui.getEditPanel().getBtnSaveLocation()) {
			
			try {
				
				DataCheck.CheckLongData(gui.getEditPanel().getTxfLocationNrOfParts().getText(), gui);		
				
				client.updateLocation(gui.getEditPanel().getTxfShelfNr()
						.getText(), gui.getEditPanel().getTxfBoxNr().getText(),
						gui.getEditPanel().getTxfLocationNrOfParts().getText(),
						gui.getEditPanel().getTxfLocationPartId().getText());
				
				gui.getEditPanel().getTxfShelfNr().setText("");
				gui.getEditPanel().getTxfBoxNr().setText("");
				gui.getEditPanel().getTxfLocationNrOfParts().setText("");
				gui.getEditPanel().getTxfLocationPartId().setText("");
				
				gui.popUp("Location updated successfully");
			} catch (RemoteException e1) {
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				gui.popUp(e1.getMessage());
			}
			

			///// Save part
		} else if (e.getSource() == gui.getEditPanel().getBtnSavePart()) {
			try {

				DataCheck.CheckLongData(gui.getEditPanel().getTxfPartId().getText(), gui);
				
				DataCheck.CheckLongData(gui.getEditPanel().getTxfShelf().getText(), gui);
				
				DataCheck.CheckLongData(gui.getEditPanel().getTxfBox().getText(), gui);
				
				DataCheck.CheckLongData(gui.getEditPanel().getTxfNrOfParts().getText(), gui);

				client.updatePart(gui.getEditPanel().getTxfPartId().getText(),
						gui.getEditPanel().getTxfPartName().getText(), gui
								.getEditPanel().getTxfMake().getText(), gui
								.getEditPanel().getTxfDescription().getText(),
						gui.getEditPanel().getTxfCategory().getText(), gui
								.getEditPanel().getTxfNrOfParts().getText(),
						gui.getEditPanel().getTxfShelf().getText(), gui
								.getEditPanel().getTxfBox().getText());

				gui.getEditPanel().getTxfPartId().setText("");
				gui.getEditPanel().getTxfShelf().setText("");
				gui.getEditPanel().getTxfBox().setText("");
				gui.getEditPanel().getTxfPartName().setText("");
				gui.getEditPanel().getTxfMake().setText("");
				gui.getEditPanel().getTxfDescription().setText("");
				gui.getEditPanel().getTxfCategory().setText("");
				gui.getEditPanel().getTxfNrOfParts().setText("");

				gui.popUp("Part updated successfully");
			} catch (RemoteException e1) {
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				gui.popUp(e1.getMessage());
			}
		}
		// /////////////////
		// //SearchPanel////
		// /////////////////

		else if (e.getSource() == gui.getSearchPanel().getBtnSearch()) {

		} else if (e.getSource() == gui.getSearchPanel().getBtnDelete()) {

		}
		// /////////////////
		// //ViewLogPanel///
		// /////////////////
		else if (e.getSource() == gui.getViewLogPanel().getBtnGetLogs()) {

		}

		// /////////////////
		// //ViewPanel////
		// /////////////////
		else if (e.getSource() == gui.getViewPanel().getBtnView()) {

			if (gui.getViewPanel().getRadioEmployee().isSelected()) {

				gui.getViewPanel().getTxfView().setText("Employees");

			} else if (gui.getViewPanel().getRadioLocation().isSelected()) {

				gui.getViewPanel().getTxfView().setText("Locations");

			} else if (gui.getViewPanel().getRadioParts().isSelected()) {
				gui.getViewPanel().getTxfView().setText("Parts");
			}

		}

		// /////////////////
		// //LogInPanel/////
		// /////////////////
		else if (e.getSource() == gui.getLogInPanel().getBtnd()) {
			try {
				if (client.login(gui.getLogInPanel().getTxfUserName().getText(), gui.getLogInPanel().getTxfPassword().getText()).equals(MANAGER))
				{
					gui.showAllPanels();
					gui.changeTab(1);
					gui.hideLoginTab();
				}
				else if(client.login(gui.getLogInPanel().getTxfUserName().getText(), gui.getLogInPanel().getTxfPassword().getText()).equals(EMPLOYEE)){
					gui.hideAllPanels();
					gui.showEmployeePanels();
					gui.hideLoginTab();
				}
				else{
					gui.popUp("Username or password incorect");
				}
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
				System.out.println("UNABLE TO CONTACT SERVER FOR SOME REASON");
			}

		}

		// /////////////////
		// /LogOutButton////
		// /////////////////
		else if (e.getSource() == gui.getCreatePanel().getBtnLogOut()
				|| e.getSource() == gui.getEditPanel().getBtnLogOut()
				|| e.getSource() == gui.getSearchPanel().getBtnLogOut()
				|| e.getSource() == gui.getViewLogPanel().getBtnLogOut()
				|| e.getSource() == gui.getViewPanel().getBtnLogOut()) {
			gui.hideAllPanels();
			gui.showLoginTab();
			gui.getLogInPanel().getTxfUserName().setText("");
			gui.getLogInPanel().getTxfPassword().setText("");
			try {
				client.logOut();
				System.out.println("Access securized");
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// /////Log out all

		}

	}
}
