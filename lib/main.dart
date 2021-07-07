import 'package:bmi_cal/results.dart';
import 'package:flutter/material.dart';
import 'homeScreen.dart';
import 'results.dart';

void main() {
  runApp(BMICalculator());
}

class BMICalculator extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData.dark().copyWith(
        primaryColor: Color(0xFF111639),
        scaffoldBackgroundColor: Color(0xFF0E1336),
      ),
      home: InputPage(),
    );
  }
}
