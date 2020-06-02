<h1>SystemExpert</h1>
<p>System Expert es un pequeño test con el cual se pretende por medio de una serie de preguntas dar un dictamen. <p>
<h3>Empezando</h3>
<p>Para su ejecución en local por medio del .jar se debe tener instalado java</p>
<span class="bodytext">
			
		
				
		
			
		










<h4>Windows</h4>

<h5 class="sub">Windows 10 y Windows 8</h5>
<ol>
<li>En Buscar, busque y seleccione: Sistema (Panel de control)</li>
<li>Haga clic en el enlace <strong>Configuración avanzada del sistema</strong>.</li>
<li>Haga clic en <strong>Variables de entorno</strong>. En la sección <strong>Variables del sistema</strong>, busque la variable de entorno <code>PATH</code> y selecciónela. Haga clic en <strong>Editar</strong>. Si no existe la variable de entorno <code>PATH</code>, haga clic en <code>Nuevo</code>.</li>
<li>En la ventana <strong>Editar la variable del sistema</strong> (o <strong>Nueva variable del sistema</strong>), debe especificar el valor de la variable de entorno <code>PATH</code>. Haga clic en <strong>Aceptar</strong>. Cierre todas las demás ventanas haciendo clic en <strong>Aceptar</strong>.</li>
<li>Vuelva a abrir la ventana del indicador de comandos y ejecute el código de java.</li></ol>







			
		
			
				</span>
        <span class="bodytext">
			
		
				
		
			
		










<h5 class="sub">Windows 7</h5>
<ol>
<li>Desde el escritorio, haga clic con el botón derecho del mouse en el icono de la <strong>computadora</strong>.</li>
<li>Seleccione <strong>Propiedades</strong> en el menú contextual.</li>
<li>Haga clic en el enlace <strong>Configuración avanzada del sistema</strong>.</li>
<li>Haga clic en <strong>Variables de entorno</strong>. En la sección <strong>Variables del sistema</strong>, busque la variable de entorno <code>PATH</code> y selecciónela. Haga clic en <strong>Editar</strong>. Si no existe la variable de entorno <code>PATH</code>, haga clic en <code>Nuevo</code>.</li>
<li>En la ventana <strong>Editar la variable del sistema</strong> (o <strong>Nueva variable del sistema</strong>), debe especificar el valor de la variable de entorno <code>PATH</code>. Haga clic en <strong>Aceptar</strong>. Cierre todas las demás ventanas haciendo clic en <strong>Aceptar</strong>.</li>
<li>Vuelva a abrir la ventana del indicador de comandos y ejecute el código de java.</li></ol>






			
		
			
				</span>
        <span class="bodytext">
			
		
				
		
			
		










<h5 class="sub">Windows XP</h5>

<ol>
<li>Seleccione <strong>Inicio</strong> y <strong>Panel de control</strong>. Haga doble clic en <strong>Sistema</strong> y seleccione el separador <strong>Opciones avanzadas</strong>.</li>
<li>Haga clic en <strong>Variables de entorno</strong>. En la sección <strong>Variables del sistema</strong>, busque la variable de entorno <code>PATH</code> y selecciónela. Haga clic en <strong>Editar</strong>. Si no existe la variable de entorno <code>PATH</code>, haga clic en <code>Nuevo</code>.</li>
<li>En la ventana <strong>Editar la variable del sistema</strong> (o <strong>Nueva variable del sistema</strong>), debe especificar el valor de la variable de entorno <code>PATH</code>. Haga clic en <strong>Aceptar</strong>. Cierre todas las demás ventanas haciendo clic en <strong>Aceptar</strong>.</li>
<li>Vuelva a abrir la ventana del indicador de comandos y ejecute el código de java.</li>
</ol>


<br>





			
		
			
				</span>
        <hr>
        <span class="bodytext">
			
		
				
		
			
		










<h4>Mac OS X</h4>

<p>Para ejecutar una versión de Java distinta, especifique la ruta completa o utilice la herramienta <code>java_home</code>:</p>
<pre xml:space="preserve">% /usr/libexec/java_home -v 1.8.0_73 --exec javac -version
</pre>




			
		
			
				</span>
        <hr>
        <span class="bodytext">
			
		
				
		
			
		










<h4>Solaris y Linux</h4>

<ol>
<li>
Para ver si la ruta está bien definida:<br> en una ventana de terminal, introduzca:<br><code>% java -version</code><br> De esta forma, se imprimirá la versión de la herramienta <code>java</code>, si se encuentra. Si la versión es antigua o aparece el error de <b>java: Comando no encontrado</b>, significa que la ruta de acceso no está bien definida.
</li>
<li>Determine qué ejecutable de Java es el que se encuentra primero en <b>PATH</b><br> En una ventana de terminal, introduzca:<br><code>% which java</code></li>
</ol>







			
		
			
				</span>
