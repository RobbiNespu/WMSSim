package com.ssi.schaefer.yanbal.barcode.insert;

import java.io.IOException;
import java.sql.SQLException;

import com.ssi.schaefer.yanbal.barcode.insert.msgwritter.BarcodeInsertWritter;
import com.ssi.schaefer.yanbal.util.conn.SendByFTP;

public class RunSenderBarcodeInsert {

	//*******************************************************************
	/** 						 				BARCODE INSERT BY FTP						 
			                       .-.
			        .-""`""-.    |(@ @)
			     _/`oOoOoOoOo`\_ \ \-/
			    '.-=-=-=-=-=-=-.' \/ \
			      `-=.=-.-=.=-'    \ /\
			         ^  ^  ^       _H_ \  
	 **/
	//*******************************************************************

	static String wamasHostIpRequested = "192.168.173.222";
	
	//static String wamasHostIpRequested = "10.34.234.2";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

		BarcodeInsertWritter.main("/barcodeInsertSocAf", "AFR", wamasHostIpRequested);
		SendByFTP.main("/barcodeInsertSocAf", wamasHostIpRequested);

		BarcodeInsertWritter.main("/barcodeInsertSocPb", "PBL", wamasHostIpRequested);
		SendByFTP.main("/barcodeInsertSocPb", wamasHostIpRequested);

		BarcodeInsertWritter.main("/barcodeInsertSocPd", "BAJ", wamasHostIpRequested);
		SendByFTP.main("/barcodeInsertSocPd", wamasHostIpRequested);
	}
}
