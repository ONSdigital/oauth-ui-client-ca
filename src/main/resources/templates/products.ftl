<#import "/spring.ftl" as spring>

<html>

<head>
    <title>OAuth UI client Demo</title>
    <link rel="stylesheet" type="text/css" href="app.css">
</head>
<body>
<div class="App">
    <header class="App-header">
        <img src="ons_logo.svg" class="App-logo" alt="logo"/>
        <h1 class="App-title">Demo OAuth Client Application</h1>
    </header>
    <h3>Welcome ${principal.getName()}, here is your shopping list</h3>
    <table class="blueTable">
        <thead>
        <tr>
            <th>Item Description</th>
            <th>Budgeted Cost</th>
        </tr>
        </thead>
            <#list products as key, value>
                <tr>
                    <td>${key}</td>
                    <td align="right">${value}</td>
                </tr>
            </#list>

    </table>

    <p>
        <a href="/logout">Logout</a>
    </p>
</div>
</body>
</html>