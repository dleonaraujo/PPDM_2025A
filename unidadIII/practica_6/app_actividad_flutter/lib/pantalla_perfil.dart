import 'package:flutter/material.dart';

class PantallaPerfil extends StatelessWidget {
  const PantallaPerfil({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text("Mi Perfil")),
      body: Padding(
        padding: const EdgeInsets.all(20.0),
        child: Column(
          children: [
            const CircleAvatar(
              radius: 60,
              backgroundImage: NetworkImage("https://enciclopedia.net/wp-content/uploads/2014/04/persona.jpg"),
            ),
            const SizedBox(height: 20),
            const Text(
              "Diego Leon",
              style: TextStyle(fontSize: 24, fontWeight: FontWeight.bold),
            ),
            const Text("Estudiante de Ingeniería de Software"),
            const SizedBox(height: 20),
            Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: const [
                Icon(Icons.email),
                SizedBox(width: 10),
                Text("dloena@ulasalle.edu.pe"),
              ],
            ),
          ],
        ),
      ),
    );
  }
}
