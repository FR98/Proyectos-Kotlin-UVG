//Francisco Rosal

package main

import main.classes.Parqueo
import main.utilidades.*


fun main(args: Array<String>) {
    println("BIENVENIDO")
    var continuar = true
    var opcion: String
    val parqueo = Parqueo(1)

    do {
        println(menu1())
        opcion = readLine()!!
        when (opcion) {
            "1" -> {
                //Menu Admin
                do {
                    var continuar2 = true
                    println(menu2())
                    opcion = readLine()!!
                    when (opcion) {
                        "1" -> {
                            //Crear Nivel
                            println("Crear un nuevo Nivel:")
                            println("Ingrese el numero del Nivel (id): ")
                            var id = readLine()!!
                            println("Ingrese el nombre del Nivel: ")
                            var name = readLine()!!
                            println("Ingrese el color representativo del Nivel: ")
                            var color = readLine()!!
                            println("Ingrese el nombre de archivo de estructura del Nivel: ")
                            var structureFileName = readLine()!!
                            println(parqueo.addNewNivel(id, name, color, structureFileName))
                        }
                        "2" -> {
                            //Eliminar Nivel
                            println("Eliminar Nivel:")
                            println("Ingrese el numero del Nivel (id): ")
                            var id = readLine()!!
                            println(parqueo.removeNivel(id))
                        }
                        "3" -> {
                            //Ver Niveles
                            println(parqueo)
                        }
                        "4" -> {
                            continuar2 = false
                        }
                        else -> println("Opcion Invalida")
                    }
                } while (continuar2)
            }
            "2" -> {
                //Menu Conductor
                do {
                    var continuar3 = true
                    println(menu3())
                    opcion = readLine()!!
                    when (opcion) {
                        "1" -> {
                            //Ingresar Placa
                        }
                        "2" -> {
                            continuar3 = false
                        }
                        else -> println("Opcion Invalida")
                    }
                } while (continuar3)
            }
            "3" -> {
                continuar = false
            }
            else -> println("Opcion Invalida")
        }

    } while (continuar)
}