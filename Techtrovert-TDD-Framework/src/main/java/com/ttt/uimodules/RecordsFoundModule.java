package com.ttt.uimodules;

import com.ttt.driverutils.UiDriverManager;
import com.ttt.uicomponents.OxdTableComponent;

public final class RecordsFoundModule extends BaseModule{
	
	private OxdTableComponent oxdTableCmpt;
	
	public RecordsFoundModule() {
		super(UiDriverManager.getDriver());
		oxdTableCmpt=new OxdTableComponent();
	}
	
	public boolean deleteRecord(String uniqueCellValue) {
		if(oxdTableCmpt.checkIfRowIsPresent(uniqueCellValue)) {
			oxdTableCmpt.deleteRow(oxdTableCmpt
					    .getRowByUniqueCellValue(uniqueCellValue))
			            .clickDelete();
			return true;
		}
		return false;
	}

}
