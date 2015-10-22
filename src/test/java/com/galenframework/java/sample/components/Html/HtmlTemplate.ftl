<html>
<head><title> ${blogTitle} </title>
<body>
<h1> ${blogTitle} </h1>
<p>
${message}
</p>
<h3>Title</h3>
<table style="width:100%">
<tr>
<#list tests as test>
    <td>${test_index + 1}. </td> <a href="${"http://www.google.cl"}"> <td>${test.title}</td></a> <td>${test.type}</td> <td>${test.input}</td>
    <td>
    <#if test.status=="Failed">
    <font color="red">${test.status}</font>
    <#else>
    <font color="green">${test.status}</font>
    </#if>
    </td>
    <td>${test.descryption}</td>
    <td>${test.date}</td>
 </tr>
</#list>
</table>
</body>
</html> 