<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="application/json; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="org.codehaus.jettison.json.JSONWriter"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.io.StringWriter" %>

<%
	JSONWriter writer = new JSONWriter(response.getWriter());
	writer.array();
	writer.object().key("AREANASHOP").value("www.areanashop.com").endObject();
	writer.object().key("PEACEWORKER").value("www.peace-worker.com").endObject();
	
	writer.endArray();
%>













