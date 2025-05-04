# Componente-Personalizado
Componentes principales:
 Componentes principales:
1. Atributos clave:
emailFrom y contra: Credenciales del correo remitente.

CorreoA, subject, Contenido: Campos dinámicos del correo a enviar.

adjuntos: Arreglo de archivos seleccionados por el usuario.

properties: Configuración SMTP para Gmail.

auth: Autenticador con las credenciales del remitente.

🔘Lógica del envío de correo (createEmail)
Recopila datos desde los campos del formulario (txtTo, txtSubject, txtContenido).

Configura una sesión Session con autenticación y propiedades SMTP.

Crea el mensaje MimeMessage, asigna remitente, destinatario, asunto y fecha.

Agrega el contenido HTML al cuerpo del mensaje.

Adjunta archivos (si fueron seleccionados).

Envía el mensaje con Transport.send(msg).

Muestra diálogos para confirmar envío o notificar errores.

🔘Interacción de botones:
Adjuntar Archivos: Abre un JFileChooser para seleccionar múltiples archivos. Muestra los nombres seleccionados.

Enviar: Llama a createEmail() para enviar el mensaje.

Limpiar: Borra todos los campos y archivos adjuntos.

Eliminar archivos: Quita todos los archivos adjuntos seleccionados.

Salir: Cierra la aplicación.

🔘Interfaz Gráfica (Swing):
Usa JPanel, JLabel, JTextField, JTextArea, JButton y JFileChooser.

Distribución simple y funcional.

Interfaz amigable para usuarios sin conocimientos técnicos.

Fortalezas del código:
Uso correcto de la librería JavaMail.

Soporte para múltiples archivos adjuntos.

Interfaz sencilla y clara.

Gestión básica de errores y validaciones.

🔘Recomendaciones:
No hardcodear credenciales. Usa variables externas o cifrado.

Validar formato de email.

Internacionalización. Usa constantes para mensajes si se busca soporte multilenguaje.

Agregar barra de progreso o bloqueo de botón durante envío.

Manejo de excepciones más específico.

🔘Clase EnviarCorreo (EnviarCorreo.java)
Esta clase representa una ventana gráfica (JFrame) para redactar y enviar correos electrónicos desde una cuenta de Gmail, incluyendo la posibilidad de adjuntar archivos.

Características principales:
Interfaz gráfica (Swing) con campos para:

Dirección del destinatario

Asunto

Contenido del mensaje

Adjuntar múltiples archivos

Envío de correo con JavaMail API:

Usa autenticación SMTP mediante smtp.gmail.com

Configura propiedades para TLS (puerto 587) y autenticación

Construye el mensaje como multipart (texto + archivos)

Funcionalidades:

btnAdjuntarArchivo: permite seleccionar múltiples archivos para adjuntar.

btnEnviar: llama a createEmail() para enviar el correo.

btnLimpiar: limpia todos los campos.

btnEliminarArchivo: borra los archivos seleccionados.

btnSalir: cierra la aplicación.

🔘 Clase BotonPersonalizado (BotonPersonalizado.java)
Esta clase define un botón gráfico personalizado que abre la ventana EnviarCorreo al hacer clic.

Características:
Hereda de JButton

Aplica estilo personalizado:

Color de fondo azul (estado normal)

Cambia a gris al pasar el cursor (hover)

Texto blanco, sin bordes ni enfoque visual

Registra un ActionListener que instancia y muestra la ventana de correo (EnviarCorreo)

Implementa un efecto visual con MouseAdapter para mejorar la experiencia del usuario.

🔘BotonPersonalizado
Es un botón gráfico personalizado en Java (usando Swing) que:

Muestra el texto: "Abrir Correo".

Cambia de color cuando el cursor pasa sobre él (efecto "hover"):

Color normal: azul.

Color al pasar el mouse: gris.

Abre una ventana para enviar correos (EnviarCorreo) cuando se hace clic.

Estéticamente mejorado, sin bordes ni resaltado de enfoque.

Este botón está diseñado para integrarse fácilmente en una interfaz gráfica más grande, como un menú principal.

🔘Explicacion de Uso del BotonPersonalizado.
El boton lo que hace es que cuando se coloca el cursor sobre el tiene el efecto de "Apagado" y se vuelve de un color grisaseo, al ser pulsado
mostrará una ventana en la cual servirá para poder enviar un correo electronico a una persona y tambien se podra mandar junto con este archivos 
adjuntandolos a los correos que se envien a sus destinatarios y tambien cuenta con unos botones los cuales eliminan los archivos que se adjuntaron
al correo y tambien cuenta con los botones de limpiar, salir y por ultimo el que envia el correo.

🔘Trabajo Realizado por:
Josue Nicolas Castañeda
Adrian Gonzalez Valentin
