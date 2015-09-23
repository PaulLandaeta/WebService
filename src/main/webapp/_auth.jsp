<!DOCTYPE HTML>
<html lang="en-US">
<head>
    <meta charset="UTF-8">

    <script type="text/javascript">
      //  window.location.href = "./swagger-ui"
    //  var url      = window.location.href;
      //  alert("url "+url);

      alert("vars "+getUrlVars());

      //var code = getParameterByName('code');

      var code = getParameterByName('code');

      alert("code "+code);

      $('#ajaxGetUserServletResponse').text(uri);

      $.get('ServletSalesforceWS', {
          code : code
      }, function(responseText) {
          $('#ajaxGetUserServletResponse').text(responseText);
      });

      function getUrlVars()
      {
          var vars = [], hash;
          var hashes = window.location.href.slice(window.location.href.indexOf('?') + 1).split('&');
          for(var i = 0; i < hashes.length; i++)
          {
              hash = hashes[i].split('=');
              vars.push(hash[0]);
              vars[hash[0]] = hash[1];
          }
          return vars;
      }

      function getParameterByName(name) {
          name = name.replace(/[\[]/, "\\[").replace(/[\]]/, "\\]");
          var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"),
                  results = regex.exec(location.search);
          return results === null ? "" : decodeURIComponent(results[1].replace(/\+/g, " "));
      }


    </script>
    <title>Page Redirection</title>
</head>
<BODY>
<h1>HOLA MUNDO</h1>
<br>
<br>
<strong>Ajax Response</strong>:
<div id="ajaxGetUserServletResponse"></div>
.
</BODY>
</html>