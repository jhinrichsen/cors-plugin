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


Installing
==========

1. Install the latest version of Maven
2. Download and extract the source for this project
3. open a terminal and `cd` to the place you extracted the project
4. `maven` with the project folder as cwd
5. Open `http://jenkins/updateCenter/advanced` - The advanced tab of jenkins plugins
6. Upload cors.hpi from project/targets to the jenkins instance
7. Restart jenkins
