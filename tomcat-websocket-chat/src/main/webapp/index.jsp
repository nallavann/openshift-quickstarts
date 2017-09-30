<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="defaultTemplate">
<tiles:putAttribute name="body">
<form action="add">
	<input type="text" name="a1"><br>
	<input type="text" name="a2"><br>
	<input type="submit" value="Submit">
</form>

<a href="emp">Employee Module</a>

</tiles:putAttribute>
</tiles:insertDefinition>