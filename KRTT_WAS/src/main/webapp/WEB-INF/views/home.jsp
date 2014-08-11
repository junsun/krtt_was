<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="application/json; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="org.codehaus.jettison.json.JSONWriter"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.io.StringWriter" %>

<%
	JSONWriter writer = new JSONWriter(response.getWriter());
	writer.array();
	writer.object().key("pue").value(String.format("%.2f",Math.floor((Double)(request.getAttribute("pue"))*100)/100) ).endObject();
	writer.object().key("outside_temperature").value( String.format("%d",Math.round((Float)( request.getAttribute("outsideTemperature")))))    .endObject();
	writer.object().key("outside_humidity").value(request.getAttribute("outsideHumidity")).endObject();
	writer.object().key("serverroom_temperature").value(String.format("%d",Math.round((Double)(request.getAttribute("serverRoomTemperatureAvg"))))).endObject();
	writer.object().key("serverroom_humidity").value(65).endObject();
	writer.object().key("inside_temperature").value(String.format("%d",Math.round((Double)(request.getAttribute("mainAHUTemperatureAvg"))))).endObject();
	writer.object().key("inside_humidity").value(String.format("%d",Math.round((Double)(request.getAttribute("mainAHUHumidityAvg"))))).endObject();
	writer.object().key("daily_carbon_emission").value(String.format("%d",Math.round((Double)(request.getAttribute("dailyCarbonEmission"))))).endObject();
	writer.object().key("global_best").value(1.09).endObject();
	writer.object().key("domestic_average").value(2.3).endObject();
	writer.object().key("goal_val").value(1.3).endObject(); 
	writer.object().key("rent_idc_daily_carbon_emission").value(132).endObject();
	
	writer.endArray();
%>













