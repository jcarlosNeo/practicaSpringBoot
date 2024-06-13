# practicaSpringBoot

Para utilizar el proyecto, primero se tiene que ejecutar tanto el servidor oauth2, como el proyecto catalogo-items.

Ahora se tiene que ingresar al link https://oauthdebugger.com/debug e ingresar

Authorize URI: http://127.0.0.1:9000/oauth2/authorize

Redirect URI: https://oauthdebugger.com/debug

Client ID: oidc-client

Scope: profile

Response type: code

Response mode: form_post


Posteriormente presiona SEND REQUEST, esto te llevara a una pagina que te proporciona el token necesario para utilizar el end point http://127.0.0.1:9000/oauth2/token, el cual se encuentra en la colección de postman proporcionada en este proyecto, sustituye en la pestaña de body el valor de "code", esto te dara el access_token, este es el que utilizaras para el resto de los end points de la colección.

Para consumir los endpoints de la api, necesitamos ir a Authorization -> Auth Type y seleccionamos Bearer Token, en Token, pegamos el access_token.

