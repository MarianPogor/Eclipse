package gui;
import java.rmi.RemoteException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import rmi.RmiClient;

public class MainGUI extends JFrame {

	private ButtonHandler buttonHandler;

	private static JTabbedPane tabPane;
	private RmiClient rmiClient;

	private LogInPanel logInPanel;
	private SearchPanel searchPanel;
	private ViewPanel viewPanel;
	private CreatePanel createPanel;
	private EditPanel editPanel;
	private ViewLogPanel viewLogPanel;

	private MyTabListener tabListener;
	private NotificationPanel notificationPanel;

	public MainGUI() throws RemoteException {
		super("Main GUI");
		this.rmiClient = new RmiClient();
		buttonHandler = new ButtonHandler(this, rmiClient);
		
		tabListener = new MyTabListener();
	
		createPanel = new CreatePanel(this, buttonHandler);
		logInPanel = new LogInPanel(this, buttonHandler);
		searchPanel = new SearchPanel(this, buttonHandler);
		viewPanel = new ViewPanel(this, buttonHandler);
		editPanel = new EditPanel(this, buttonHandler);
		viewLogPanel = new ViewLogPanel(this, buttonHandler);
		notificationPanel = new NotificationPanel(this,buttonHandler);
		
		tabPane = new JTabbedPane();
		
	
		showLoginTab();
		
	
		// tabPane.setVisible(false);
		editPanel.setVisible(false);
		tabPane.addChangeListener(tabListener);
	
		add(tabPane);
		setSize(900, 600);
		setVisible(true);
		setResizable(false);
	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}


	public void changeTab(int index) {
		tabPane.setSelectedIndex(index);
	}


	public void showAllPanels() {
		tabPane.addTab("Search panel", searchPanel);
		tabPane.addTab("View panel", viewPanel);
		tabPane.addTab("Create panel", createPanel);
		tabPane.addTab("Edit panel", editPanel);
		tabPane.addTab("View Log panel", viewLogPanel);
		tabPane.addTab("Notification panel", notificationPanel);
		tabPane.repaint();
	}
	
	public void hideAllPanels() {
		tabPane.remove(searchPanel);
		tabPane.remove(viewPanel);
		tabPane.remove(createPanel);
		tabPane.remove(editPanel);
		tabPane.remove(viewLogPanel);
		tabPane.remove(notificationPanel);
		tabPane.repaint();
	}

	public void hideLoginTab(){
		tabPane.remove(logInPanel);
		tabPane.repaint();
	}
	
	public void showLoginTab(){
		tabPane.addTab("Log In panel", logInPanel);
		tabPane.repaint();
	}
	
	
	public void showEmployeePanels(){
		tabPane.addTab("Search panel", searchPanel);
		tabPane.addTab("View panel", viewPanel);
		tabPane.repaint();
	}
	
	public void showEditPart(){
		getEditPanel().getLblPartId().setVisible(true);
		getEditPanel().getTxfPartId().setVisible(true);
		getEditPanel().getLblShelf().setVisible(true);
		getEditPanel().getTxfShelf().setVisible(true);
		getEditPanel().getLblBox().setVisible(true);
		getEditPanel().getTxfBox().setVisible(true);
		getEditPanel().getLblPartName().setVisible(true);
		getEditPanel().getTxfPartName().setVisible(true);
		getEditPanel().getLblMake().setVisible(true);
		getEditPanel().getTxfMake().setVisible(true);
		getEditPanel().getLblDescription().setVisible(true);
		getEditPanel().getTxfDescription().setVisible(true);
		getEditPanel().getLblCategory().setVisible(true);
		getEditPanel().getTxfCategory().setVisible(true);
		getEditPanel().getLblNrOfParts().setVisible(true);
		getEditPanel().getTxfNrOfParts().setVisible(true);
		getEditPanel().getBtnSavePart().setVisible(true);
	}
	
	public void hideEditPart(){
		getEditPanel().getLblPartId().setVisible(false);
		getEditPanel().getTxfPartId().setVisible(false);
		getEditPanel().getLblShelf().setVisible(false);
		getEditPanel().getTxfShelf().setVisible(false);
		getEditPanel().getLblBox().setVisible(false);
		getEditPanel().getTxfBox().setVisible(false);
		getEditPanel().getLblPartName().setVisible(false);
		getEditPanel().getTxfPartName().setVisible(false);
		getEditPanel().getLblMake().setVisible(false);
		getEditPanel().getTxfMake().setVisible(false);
		getEditPanel().getLblDescription().setVisible(false);
		getEditPanel().getTxfDescription().setVisible(false);
		getEditPanel().getLblCategory().setVisible(false);
		getEditPanel().getTxfCategory().setVisible(false);
		getEditPanel().getLblNrOfParts().setVisible(false);
		getEditPanel().getTxfNrOfParts().setVisible(false);
		getEditPanel().getBtnSavePart().setVisible(false);
	}
	
	
	public void showEditEmployee(){
		getEditPanel().getLblName().setVisible(true);
		getEditPanel().getTxfName().setVisible(true);
		getEditPanel().getLblSSN().setVisible(true);
		getEditPanel().getTxfSSN().setVisible(true);
		getEditPanel().getLblPhoneNr().setVisible(true);
		getEditPanel().getTxfPhoneNr().setVisible(true);
		getEditPanel().getLblMngSSN().setVisible(true);
		getEditPanel().getTxfMngSSn().setVisible(true);
		getEditPanel().getLblUsername().setVisible(true);
		getEditPanel().getTxfUsername().setVisible(true);
		getEditPanel().getLblPassword().setVisible(true);
		getEditPanel().getTxfPassword().setVisible(true);
		getEditPanel().getBtnSaveEmployee().setVisible(true);
	}
	
	public void hideEditEmployee(){
		getEditPanel().getLblName().setVisible(false);
		getEditPanel().getTxfName().setVisible(false);
		getEditPanel().getLblSSN().setVisible(false);
		getEditPanel().getTxfSSN().setVisible(false);
		getEditPanel().getLblPhoneNr().setVisible(false);
		getEditPanel().getTxfPhoneNr().setVisible(false);
		getEditPanel().getLblMngSSN().setVisible(false);
		getEditPanel().getTxfMngSSn().setVisible(false);
		getEditPanel().getLblUsername().setVisible(false);
		getEditPanel().getTxfUsername().setVisible(false);
		getEditPanel().getLblPassword().setVisible(false);
		getEditPanel().getTxfPassword().setVisible(false);
		getEditPanel().getBtnSaveEmployee().setVisible(false);
	}
	
	public void showEditLocation(){
		getEditPanel().getLblShelfNr().setVisible(true);
		getEditPanel().getTxfShelfNr().setVisible(true);
		getEditPanel().getLblBoxNr().setVisible(true);
		getEditPanel().getTxfBoxNr().setVisible(true);
		getEditPanel().getLblLocationNrOfParts().setVisible(true);
		getEditPanel().getTxfLocationNrOfParts().setVisible(true);
		getEditPanel().getLblLocationPartId().setVisible(true);
		getEditPanel().getTxfLocationPartId().setVisible(true);
		getEditPanel().getBtnSaveLocation().setVisible(true);

	}
	
	public void hideEditLocation(){
		getEditPanel().getLblShelfNr().setVisible(false);
		getEditPanel().getTxfShelfNr().setVisible(false);
		getEditPanel().getLblBoxNr().setVisible(false);
		getEditPanel().getTxfBoxNr().setVisible(false);
		getEditPanel().getLblLocationNrOfParts().setVisible(false);
		getEditPanel().getTxfLocationNrOfParts().setVisible(false);
		getEditPanel().getLblLocationPartId().setVisible(false);
		getEditPanel().getTxfLocationPartId().setVisible(false);
		getEditPanel().getBtnSaveLocation().setVisible(false);
	}
	
	
	public NotificationPanel getNotificationPanel() {
		return notificationPanel;
	}
	public void setNotificationPanel(NotificationPanel notificationPanel) {
		this.notificationPanel = notificationPanel;
	}
	
	public void popUp(String message){
		JOptionPane.showMessageDialog(this, message);
	}

	public LogInPanel getLogInPanel() {
		return logInPanel;
	}

	public void setLogInPanel(LogInPanel logInPanel) {
		this.logInPanel = logInPanel;
	}

	public SearchPanel getSearchPanel() {
		return searchPanel;
	}

	public void setSearchPanel(SearchPanel searchPanel) {
		this.searchPanel = searchPanel;
	}

	public ViewPanel getViewPanel() {
		return viewPanel;
	}

	public void setViewPanel(ViewPanel viewPanel) {
		this.viewPanel = viewPanel;
	}

	public CreatePanel getCreatePanel() {
		return createPanel;
	}

	public void setCreatePanel(CreatePanel createPanel) {
		this.createPanel = createPanel;
	}

	public EditPanel getEditPanel() {
		return editPanel;
	}

	public void setEditPanel(EditPanel editPanel) {
		this.editPanel = editPanel;
	}

	public ViewLogPanel getViewLogPanel() {
		return viewLogPanel;
	}

	public void setViewLogPanel(ViewLogPanel viewLogPanel) {
		this.viewLogPanel = viewLogPanel;
	}

	private class MyTabListener implements ChangeListener {
		@Override
		public void stateChanged(ChangeEvent e) {
		}
	}

	public static void main(String[] args) throws RemoteException {
		MainGUI gui = new MainGUI();
	}
}
