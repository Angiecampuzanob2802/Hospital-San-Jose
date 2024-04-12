Proyecto Final
Hospital San José St. Bonaventure

El Hospital San José St. Bonaventure ha venido a la Universidad Autónoma de
Manizales con el fin de solicitar a los estudiantes de la asignatura de Programación
Orientada a Objetos la renovación de su sistema central, el cual está dividido por
los siguientes módulos, Gestión de Empleados, Gestión de Pacientes, Gestión de
Farmacia y Reportes.
Para realizar el sistema debe considerar que del Hospital se almacenará su nombre,
dirección, teléfono, logo, presupuesto, meta de ventas anual, fecha de fundación,
estado (activo o en quiebra) y localización, para esta última es importante
contemplar latitud y longitud, ya que facilitará identificar su ubicación mediante un
mapa, también es importante asociar la información del gerente del cual se conoce
su nombre, número de documento de identificación, edad y carrera. Esta
información puede ser editada por el usuario en cualquier momento mediante la
interfaz gráfica. Como datos iniciales considere los siguientes los cuales deberán
ser tomados desde un archivo de texto plano (este se debe modificar si es que se
edita la información desde la interfaz gráfica):
Hospital
Nombre Hospital San Jose St. Bonaventure
Dirección 2425 Samaritan Dr, San Jose, CA 95124,Estados Unidos
Teléfono +1 408-559-2011
Logo
Presupuesto 1.000.000
Fecha de fundación 1965
Localización
Latitud 37.25157313140872
Longitud -121.94667417922749

Gerente
Nombre Aaron Glassman
Número de documento 84.941.564
Edad 69
Carrera Neurocirujano

En cuanto al desarrollo de cada modulo tenga en cuenta lo siguiente:

Módulo de Empleados:
Se debe permitir la gestión de empleados, teniendo en cuenta que de cada uno se
almacenará su nombre, número de documento, edad, salario base, además de esto
considere que existen dos tipos de empleados en el hospital, el Empleado del área
de la salud del cual se debe almacenar su especialidad y número de horas
trabajadas, por otro lado, se cuentan con Empleados operativos de ellos se debe
almacenar el área para la cual trabajan. Se debe tener en cuenta que cuando se
crea un empleado solo se ingresa su salario base ya que el proceso para calcular
salario de ambos empleados es diferente; para el empleado de la salud se deberá
tomar el 1.2% del salario base y multiplicarlo por el número de horas trabajadas y
luego sumarlos. Al empleado operativo se le sumará el 20% al salario base para
obtener el salario neto a retornar.
Debe considerar que el sistema permitirá el proceso de nomina el cual consiste en
sumar el salario de todos los empleados y almacenarlos junto a la fecha de
realización de la nómina y un identificador único. Tenga en cuanta que cada que se
ejecuta un proceso de generación y almacenamiento de nomina se debe descontar
el total de esa nomina al presupuesto global del hospital, considerar que en caso tal
de que el presupuesto del hospital sea negativo se debe ejecutar un evento anómalo
y manejarlo ya que esto cambia el estado del hospital de activo a en quiebra, no se
debe permitir generar más procesos de nómina, para repararlo debe ejecutar una
acción en el hospital denominada registrar patrocinio el cual tiene un valor y este si
es superior al monto en deuda podrá cambiar el estado del hospital y permitir
realizar las tareas, también tenga en cuenta que para todos estos cambios se debe
informar al usuario del sistema que esto ocurrió.

Módulo de Pacientes:
Se permitirá la gestión de pacientes de los cuales se conoce su nombre, número de
documento, edad, correo electrónico, teléfono, estado (saludable o critico), una lista
de enfermedades (nombre y descripción), estos serán recetables ya que podrán
ejecutar la acción de curar enfermedad la cual consiste en recibir un medicamento
y una enfermedad pues esta será eliminada de la lista de enfermedades del paciente
y se agregará el medicamento (nombre, descripción y enfermedad que alivia) a la
lista correspondiente de medicinas, en caso tal de que se recete un medicamento
que ya está en la lista o se intente curar una enfermedad que no posee el paciente
se ejecutará una anomalía en el sistema por lo cual se deberá informar al usuario
que esto no se permite, además el paciente cambiará el estado de saludable a
crítico, o cuando el paciente se encuentre sin lista de enfermedades su estado
volverá a ser saludable.
La acción de curar a un paciente solo se podrá realizar cuando se este llevando a
cabo el registro de una cita al hospital, pues allí se debe almacenar la información
del paciente que se atiende, el medico que lleva a cabo la consulta, la fecha y el
valor de la cita, una vez esta sea almacenada se deberá sumar el valor de la cita al
presupuesto total del hospital.

Módulo de Farmacia:
Se debe permitir la gestión de medicamentos mediante el uso de un inventario del
cual se conoce su código y año de actualización, en él se almacenará la información
de los medicamentos, los cuales almacenan su nombre, su descripción, su costo y
su precio de venta, existen dos clases diferentes de medicamentos, los genéricos
(calculan su precio de venta sumando un 10% al costo) y los de marca (almacenan
el fabricante y calculan su precio de venta sumando un 25% al costo) el calculo del
precio de venta se realiza de forma automática una vez se agregue este al
inventario.

Cada vez que se registra un medicamento se deberá disminuir el costo al
presupuesto de los hospital en caso tal de que el presupuesto sea negativo se debe
ejecutar un evento anómalo y manejarlo ya que esto cambia el estado del hospital
de activo a en quiebra, no se debe permitir comprar más medicamentos para
agregarlos al inventario (para repararlo debe realizar el flujo mencionado en el
módulo de empleados) y se debe informar al usuario del sistema que esto ocurrió.
Los medicamentos podrán venderse al público lo cual incrementará el presupuesto
del hospital, de la venta se quiere conocer su id y valor total, y se podrán gestionar
desde el hospital, tener en cuenta que si las ventas ya sea de medicamentos o
ingresos por inversiones o atención a pacientes superan el monto de la meta
establecida para el año se deberá generar un evento excepcional de festividad ya
que se deberá mostrar al usuario de lo ocurrido y aumentar el presupuesto en un
10% por la celebración.
Módulo Reportes
Se debe generar reportes asociados a los módulos anteriores en el formato de su
preferencia también considerar persistir en archivos de texto las acciones realizadas
en el sistema con el fin de que no se pierda información cuando se cierre el sistema
El sistema debe tener interfaz gráfica con diseño estilizado y fácil de utilizar, cabe
resaltar que debe permitir con la gestión (CRUD) de cada elemento que considere
dentro de los mencionado anteriormente.
Tenga presente de que en caso tal de presentar alguna duda sobre el desarrollo o
la necesidad del negocio, debe comunicarse con el stake holder (cliente quién
solicita el software) en este caso el docente del curso.
