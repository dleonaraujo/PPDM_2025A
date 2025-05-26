import 'package:flutter/material.dart';

class PantallaHobbies extends StatelessWidget {
  const PantallaHobbies({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text("Mis Hobbies")),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          children: [
            hobbyItem(Icons.book, "Me dedico a estudiar"),
            const SizedBox(height: 10),
            hobbyItem(Icons.music_note, "Escuchar música pop"),
            const SizedBox(height: 10),
            hobbyItem(Icons.sports_esports, "Discutir sobre peliculas o series"),
          ],
        ),
      ),
    );
  }

  Widget hobbyItem(IconData icon, String text) {
    return Row(
      children: [
        Icon(icon, size: 30),
        const SizedBox(width: 10),
        Expanded(child: Text(text, style: const TextStyle(fontSize: 18))),
      ],
    );
  }
}
