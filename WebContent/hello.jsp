<%@ taglib uri="http://struts.apache.org/tags-html" prefix="h"%>

<h:form action="/hello">

	<h:text property="message" />
	<h:submit />

	<hr />
	<h:errors />

</h:form>