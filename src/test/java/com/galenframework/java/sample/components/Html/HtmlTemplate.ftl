<html>
<head><title> ${blogTitle} </title>
<body>
<h1> ${blogTitle} </h1>
<p>
${message}
</p>
<h3>Title </h3>
<#list tests as test>
${test_index + 1}. <a href="${"http://www.google.cl"}"> ${test.title}</a> ${test.type} ${test.input}
    <#if test.status=="Failed">
    <font color="red">${test.status}</font>
    <#else>
    <font color="green">${test.status}</font>$
    </#if>
${test.descryption}
${test.date} <br/>
</#list>
</body>
</html> 