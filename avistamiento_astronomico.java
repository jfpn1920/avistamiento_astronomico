import java.util.Scanner;
public class avistamiento_astronomico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] objetos = new String[10];
        String[] tipos = new String[10];
        String[] fechas = new String[10];
        String[] horas = new String[10];
        String[] ubicaciones = new String[10];
        String[] instrumentos = new String[10];
        int[] duraciones = new int[10];
        String[] visibilidades = new String[10];
        String[] observadores = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //------------------------------------------------//
        //--|menu_principal_de_avistamiento_astronomico|--//
        //------------------------------------------------//
        do {
            System.out.println("menu principal de avistamiento astronomico");
            System.out.println("1) Registrar avistamiento");
            System.out.println("2) Editar avistamiento");
            System.out.println("3) Listar avistamientos");
            System.out.println("4) Buscar avistamiento");
            System.out.println("5) Eliminar avistamiento");
            System.out.println("6) Mostrar resumen");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //----------------------------//
                //--|registrar_avistamiento|--//
                //----------------------------//
                case 1:
                    if (total >= objetos.length) {
                        System.out.println("No hay espacio para registrar mas avistamientos.");
                        break;
                    }
                    System.out.println("registro de avistamiento");
                    System.out.println("ID: " + (total + 1));
                    System.out.print("objeto observado: ");
                    objetos[total] = entrada.nextLine();
                    System.out.print("tipo de objeto: ");
                    tipos[total] = entrada.nextLine();
                    System.out.print("fecha: ");
                    fechas[total] = entrada.nextLine();
                    System.out.print("hora: ");
                    horas[total] = entrada.nextLine();
                    System.out.print("ubicacion: ");
                    ubicaciones[total] = entrada.nextLine();
                    System.out.print("instrumento utilizado: ");
                    instrumentos[total] = entrada.nextLine();
                    System.out.print("duracion en minutos: ");
                    duraciones[total] = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("visibilidad: ");
                    visibilidades[total] = entrada.nextLine();
                    System.out.print("observador: ");
                    observadores[total] = entrada.nextLine();
                    System.out.print("estado: ");
                    estados[total] = entrada.nextLine();
                    total++;
                    System.out.println("Avistamiento registrado correctamente.");
                    break;
                //-------------------------//
                //--|editar_avistamiento|--//
                //-------------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen avistamientos registrados.");
                        break;
                    }
                    System.out.println("datos de los avistamientos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Objeto: " + objetos[i] + " | Tipo: " + tipos[i] + " | Fecha: " + fechas[i] + " | Hora: " + horas[i] + " | Ubicacion: " + ubicaciones[i] + " | Instrumento: " + instrumentos[i] + " | Duracion: " + duraciones[i] + " minutos | Visibilidad: " + visibilidades[i] + " | Observador: " + observadores[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del avistamiento a editar: ");
                    int idEditar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEditar >= 1 && idEditar <= total) {
                        int posicion = idEditar - 1;
                        System.out.println("editar avistamiento");
                        System.out.print("nuevo objeto observado: ");
                        objetos[posicion] = entrada.nextLine();
                        System.out.print("nuevo tipo de objeto: ");
                        tipos[posicion] = entrada.nextLine();
                        System.out.print("nueva fecha: ");
                        fechas[posicion] = entrada.nextLine();
                        System.out.print("nueva hora: ");
                        horas[posicion] = entrada.nextLine();
                        System.out.print("nueva ubicacion: ");
                        ubicaciones[posicion] = entrada.nextLine();
                        System.out.print("nuevo instrumento utilizado: ");
                        instrumentos[posicion] = entrada.nextLine();
                        System.out.print("nueva duracion en minutos: ");
                        duraciones[posicion] = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("nueva visibilidad: ");
                        visibilidades[posicion] = entrada.nextLine();
                        System.out.print("nuevo observador: ");
                        observadores[posicion] = entrada.nextLine();
                        System.out.print("nuevo estado: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Avistamiento actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //--------------------------//
                //--|listar_avistamientos|--//
                //--------------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen avistamientos registrados.");
                    } else {
                        System.out.println("lista de avistamientos");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Objeto: " + objetos[i] + " | Tipo: " + tipos[i] + " | Fecha: " + fechas[i] + " | Hora: " + horas[i] + " | Ubicacion: " + ubicaciones[i] + " | Instrumento: " + instrumentos[i] + " | Duracion: " + duraciones[i] + " minutos | Visibilidad: " + visibilidades[i] + " | Observador: " + observadores[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //-------------------------//
                //--|buscar_avistamiento|--//
                //-------------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen avistamientos registrados.");
                        break;
                    }
                    System.out.println("busqueda de avistamiento");
                    System.out.print("Ingrese el ID del avistamiento a buscar: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("avistamiento encontrado");
                        System.out.println("ID: " + idBusqueda + " | Objeto: " + objetos[posicion] + " | Tipo: " + tipos[posicion] + " | Fecha: " + fechas[posicion] + " | Hora: " + horas[posicion] + " | Ubicacion: " + ubicaciones[posicion] + " | Instrumento: " + instrumentos[posicion] + " | Duracion: " + duraciones[posicion] + " minutos | Visibilidad: " + visibilidades[posicion] + " | Observador: " + observadores[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------------//
                //--|eliminar_avistamiento|--//
                //---------------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen avistamientos registrados.");
                        break;
                    }
                    System.out.println("datos de los avistamientos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Objeto: " + objetos[i] + " | Tipo: " + tipos[i] + " | Fecha: " + fechas[i] + " | Hora: " + horas[i] + " | Ubicacion: " + ubicaciones[i] + " | Instrumento: " + instrumentos[i] + " | Duracion: " + duraciones[i] + " minutos | Visibilidad: " + visibilidades[i] + " | Observador: " + observadores[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del avistamiento a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            objetos[i] = objetos[i + 1];
                            tipos[i] = tipos[i + 1];
                            fechas[i] = fechas[i + 1];
                            horas[i] = horas[i + 1];
                            ubicaciones[i] = ubicaciones[i + 1];
                            instrumentos[i] = instrumentos[i + 1];
                            duraciones[i] = duraciones[i + 1];
                            visibilidades[i] = visibilidades[i + 1];
                            observadores[i] = observadores[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Avistamiento eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|mostrar_resumen|--//
                //---------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen avistamientos registrados.");
                        break;
                    }
                    int totalMinutos = 0;
                    for (int i = 0; i < total; i++) {
                        totalMinutos += duraciones[i];
                    }
                    String objetoMayor = objetos[0];
                    int cantidadObjetoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadObjeto = 0;
                        for (int j = 0; j < total; j++) {
                            if (objetos[i].equalsIgnoreCase(objetos[j])) {
                                cantidadObjeto++;
                            }
                        }
                        if (cantidadObjeto > cantidadObjetoMayor) {
                            cantidadObjetoMayor = cantidadObjeto;
                            objetoMayor = objetos[i];
                        }
                    }
                    String tipoMayor = tipos[0];
                    int cantidadTipoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadTipo = 0;
                        for (int j = 0; j < total; j++) {
                            if (tipos[i].equalsIgnoreCase(tipos[j])) {
                                cantidadTipo++;
                            }
                        }
                        if (cantidadTipo > cantidadTipoMayor) {
                            cantidadTipoMayor = cantidadTipo;
                            tipoMayor = tipos[i];
                        }
                    }
                    String observadorMayor = observadores[0];
                    int cantidadObservadorMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadObservador = 0;
                        for (int j = 0; j < total; j++) {
                            if (observadores[i].equalsIgnoreCase(observadores[j])) {
                                cantidadObservador++;
                            }
                        }
                        if (cantidadObservador > cantidadObservadorMayor) {
                            cantidadObservadorMayor = cantidadObservador;
                            observadorMayor = observadores[i];
                        }
                    }
                    String ubicacionMayor = ubicaciones[0];
                    int cantidadUbicacionMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadUbicacion = 0;
                        for (int j = 0; j < total; j++) {
                            if (ubicaciones[i].equalsIgnoreCase(ubicaciones[j])) {
                                cantidadUbicacion++;
                            }
                        }
                        if (cantidadUbicacion > cantidadUbicacionMayor) {
                            cantidadUbicacionMayor = cantidadUbicacion;
                            ubicacionMayor = ubicaciones[i];
                        }
                    }
                    String instrumentoMayor = instrumentos[0];
                    int cantidadInstrumentoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadInstrumento = 0;
                        for (int j = 0; j < total; j++) {
                            if (instrumentos[i].equalsIgnoreCase(instrumentos[j])) {
                                cantidadInstrumento++;
                            }
                        }
                        if (cantidadInstrumento > cantidadInstrumentoMayor) {
                            cantidadInstrumentoMayor = cantidadInstrumento;
                            instrumentoMayor = instrumentos[i];
                        }
                    }
                    int excelente = 0;
                    int buena = 0;
                    int regular = 0;
                    int baja = 0;
                    int registrados = 0;
                    int enObservacion = 0;
                    int finalizados = 0;
                    int cancelados = 0;
                    for (int i = 0; i < total; i++) {
                        if (visibilidades[i].equalsIgnoreCase("Excelente")) {
                            excelente++;
                        } else if (visibilidades[i].equalsIgnoreCase("Buena")) {
                            buena++;
                        } else if (visibilidades[i].equalsIgnoreCase("Regular")) {
                            regular++;
                        } else if (visibilidades[i].equalsIgnoreCase("Baja")) {
                            baja++;
                        }
                        if (estados[i].equalsIgnoreCase("Registrado")) {
                            registrados++;
                        } else if (estados[i].equalsIgnoreCase("En observacion")) {
                            enObservacion++;
                        } else if (estados[i].equalsIgnoreCase("Finalizado")) {
                            finalizados++;
                        } else if (estados[i].equalsIgnoreCase("Cancelado")) {
                            cancelados++;
                        }
                    }
                    double promedioDuracion = (double) totalMinutos / total;
                    System.out.println("resumen de avistamiento astronomico");
                    System.out.println("Avistamientos registrados: " + total);
                    System.out.println("Objeto mas observado: " + objetoMayor);
                    System.out.println("Tipo de objeto mas observado: " + tipoMayor);
                    System.out.println("Observador con mas registros: " + observadorMayor);
                    System.out.println("Ubicacion mas utilizada: " + ubicacionMayor);
                    System.out.println("Instrumento mas utilizado: " + instrumentoMayor);
                    System.out.println("Total de minutos de observacion: " + totalMinutos);
                    System.out.println("Promedio de duracion: " + promedioDuracion + " minutos");
                    System.out.println("Visibilidad excelente: " + excelente);
                    System.out.println("Visibilidad buena: " + buena);
                    System.out.println("Visibilidad regular: " + regular);
                    System.out.println("Visibilidad baja: " + baja);
                    System.out.println("Avistamientos registrados: " + registrados);
                    System.out.println("Avistamientos en observacion: " + enObservacion);
                    System.out.println("Avistamientos finalizados: " + finalizados);
                    System.out.println("Avistamientos cancelados: " + cancelados);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Avistamiento Astronomico.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}