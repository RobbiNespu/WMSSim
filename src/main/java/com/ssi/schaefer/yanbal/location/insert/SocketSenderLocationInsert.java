package com.ssi.schaefer.yanbal.location.insert;

import java.io.IOException;
import java.sql.SQLException;

import com.ssi.schaefer.yanbal.location.insert.msgwritter.LocationInsertWritter;
import com.ssi.schaefer.yanbal.util.conn.SendByFTP;

public class SocketSenderLocationInsert {

	//*******************************************************************
	/** 						 				LOCATION INSERT  						 
			                       .-.
			        .-""`""-.    |(@ @)
			     _/`oOoOoOoOo`\_ \ \-/
			    '.-=-=-=-=-=-=-.' \/ \
			      `-=.=-.-=.=-'    \ /\
			         ^  ^  ^       _H_ \  
	 **/
	//*******************************************************************

	static String wamasHostIpRequested = "192.168.173.222"; //10.34.234.2

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

		LocationInsertWritter.main("/locationInsertSocAf", "AF", wamasHostIpRequested);
		SendByFTP.main("/locationInsertAf", wamasHostIpRequested);

		LocationInsertWritter.main("/locationInsertSocPb", "PB", wamasHostIpRequested);
		SendByFTP.main("/locationInsertPb", wamasHostIpRequested);

		LocationInsertWritter.main("/locationInsertSocPd", "PD", wamasHostIpRequested);
		SendByFTP.main("/locationInsertPd", wamasHostIpRequested);

	}
}
