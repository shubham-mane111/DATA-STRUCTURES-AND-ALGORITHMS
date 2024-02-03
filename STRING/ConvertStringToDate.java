package com.programs;

import java.text.SimpleDateFormat;

import java.util.Date;

public class ConvertStringToDate {

	public static void main(String[] args) throws Exception {
		String strDate = "29/12/9696";
        Date date = new SimpleDateFormat("dd/mm/yyyy").parse(strDate);
        System.out.print(strDate + " " + date);

	}

}
