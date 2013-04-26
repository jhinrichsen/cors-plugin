cors-plugin
===========

Jenkins CORS plugin

Extend Jenkins to supply <a href='http://www.w3.org/TR/cors/' target='_blank'>CORS</a> header.
Use system properties to override defaults:
<table>
  <tr>
    <th>CORS header</th>                  <th>System property</th>    <th>Default</th>
  </tr>
  <tr>
    <td>Access-Control-Allow-Origin</td>  <td>cors.origin</td>        <td>*</td>
  </tr><tr>
    <td>Access-Control-Allow-Methods</td> <td>cors.methods</td>       <td>GET, POST, PUT, DELETE</td>
  </tr><tr>
    <td>Access-Control-Allow-Headers</td> <td>cors.headers</td>       <td>Authorization</td>
  </tr>
</table>

