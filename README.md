## ***Resolucion-de-conflictos***
## ***Git Tags, localizar versiones***

En este repositorio se desarrollara la practica Git resolucion de conflictos y Git tags, localizar versiones para la cual se desarrollaran las siguientes tareas:

    RESOLUCION DE CONFLICTOS:
    
    1- Primera tarea:

                 -[x] Clonar un proyecto java en dos caspetas distintas, caspetaInstituto y carpetaCasa.
 
                 -[x] Desde carpetaCasa hacer un cambio y subirlo.
 
                 -[x]  Crear una nueva clase en carpetaInstituto y subirla.
 
    * Describir que ha pasado durante el proceso que problemas surgen y como lo he solucionado:
        + Esto se realizo directamente desde IntellJ, al hacer el ultimo push de primeras me lo rechazo porque me dijo que los cambios debien 
        fusionarse y me daba dos formas, merge y rebase, yo use merge.
    
    2- Segunda tarea:
    
                 -[x] Resuelto lo anterior, hacer pull en carpetaCasa para que coincidan.
    
                 -[x] Cambiar en ambas carpetas la misma linea de un fichero y sin hacer pull subirlo
    
    * Describir que ha pasado durante el proceso que problemas surgen y como lo he solucionado:
       + Al hacer pull en carpetaCasa me pide fusionar los cambios y me da dos opciones, rebase y merge, use merge.
       + Al subir los cambios en el segundo push me volvio a dar la opcion de hacer marge o rebase, pero luego me notifico
       si queria mantener sus cambios o los mios o una tercera opcion de seguir con merge, le di a mantener los suyos y me hizo un merge de la rama principal del remoto
        a mi rama principal del repositoria de carpetaInstituto. 
    
    3- Tercera tarea:

                -[x] Solucionada la tarea 2, hacer cambios distintos en las dos carpetas en la misma linea y sin hacer pull subirlas
  
    * Describir que ha pasado durante el proceso que problemas surgen y como lo he solucionado:
    Lo que ocurrió fue muy parecido al ultimo punto de la tarea dos, me dio la opcion de fusionar con marge o rebase, al volver a 
    usar marge me volvio a preguntar si queria guardar sus cambios o los mios o la opción merge, le de esta vez a la opcion merge
    y me salio una ventana dividada en tres donde me aparecian señalados los conflictos y que conflictos queria mantener de cada lado
    elegí todos los cambios de carpetaCasa.
    
    #Observaciones:
      - Elegí siempre marge porque a pesar de que rebase en teoria hace limpias en commits en las ramas y puede quedar un rama 
      mas clara y mas legible se podian perder commits y creo que podia ser contraproducente para la tarea.
      - La tarea la realice directamente desde IntelliJ sin comandos.
      
  
  
  
    GIT TAGS, LOCALIZAR VERSIONES:
    
    1- Cree un tag, no tuve ningun problema. Hice push y luego pull en la carpeta instituto para guardar el tag.
    
    2- Volvi a la primera version en carpeta casa (No era exactamente el primer commit, pero si el primero donde cree un archivo java), 
    e hice un cambio, hice commit de ese cambio, este paso no supuso ningun problema.
    
    3- Intente hacer push desde carpetaCasa, en ese momento me dice que no me encuentro actualmente en ninguna rama 
    (el head de mi local apunta a otro lugar del remoto), me pide que si quiere empujarlo le indique la rama a la que quiero empujarlo.
    
    4- Lo subo a otra rama, en este momento se crea una nueva rama en el remoto y me dice que se habia subido todo.
    
    5- En este momento en la pagina de git me da la opción de hacer pull request. Al darle me pone que no se puede fusionar directamente, que compare.
    se abre la posibillidad de un "chat" donde se discutan los cambios el jefe de proyecto con los coperadores que introducen el cambio.
    
    6- Cerre el pull request sin ningun cambio por lo tanto conservo las dos ramas, la main y la que cree para hacer push desde el primer commit en carpetaCasa.
    podria funsionarlas.
    
    #Obaservaciones:
      - Hice esta tarea sobretodo con comandos, excepto los problemas que tuve el dia 15 que tuve que hacer muchos commit no deseados para solucionar conflictos.
      
  
  
  ![Commits](C:\Users\carlo\Desktop\Modulo DAW\Lenguaje de marcas\Resolucion de conflictos\carpetaCasa\CarpetaCasa.PNG)