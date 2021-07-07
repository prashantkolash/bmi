import 'package:flutter/material.dart';

// ignore: camel_case_types
class insideEveryCard extends StatelessWidget {
  final IconData iconForDiffCards;
  final String textForDiffCards;
  insideEveryCard({this.iconForDiffCards, this.textForDiffCards});
  @override
  Widget build(BuildContext context) {
    return Column(
      mainAxisAlignment: MainAxisAlignment.center,
      children: <Widget>[
        Icon(
          iconForDiffCards,
          size: 80.0,
        ),
        SizedBox(
          height: 2.0,
        ),
        Text(
          textForDiffCards,
        )
      ],
    );
  }
}
