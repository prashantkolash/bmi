import 'dart:math';

import 'package:flutter/material.dart';

class CalculatorBrain {
  CalculatorBrain(this.h, this.w);
  final int h;
  final int w;
  double _bmi;

  String calculateBmi() {
    _bmi = w / (pow(h / 100, 2));
    return _bmi.toStringAsFixed(1);
  }

  String getResult() {
    if (_bmi >= 25) {
      return 'overweight';
    } else if (_bmi > 18.5) {
      return 'normal';
    } else {
      return 'underweight';
    }
  }

  String getInterpretation() {
    if (_bmi >= 25) {
      return 'You have a higher than normal body weight. Try to exercise more.';
    } else if (_bmi > 18) {
      return 'You have normal body weight, Good job!';
    } else {
      return 'You have lower than normal body weight. You can get a bit more.';
    }
  }
}
