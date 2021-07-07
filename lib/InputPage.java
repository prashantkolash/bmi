import 'package:flutter/material.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';
import 'package:font_awesome_flutter/src/icon_data.dart';

const containerColor = Color(0xFF272B4D);
const bmiColor = Color(0xFFFF0067);

class InputPage extends StatefulWidget {
  @override
  _InputPageState createState() => _InputPageState();
}

class _InputPageState extends State<InputPage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Center(
          child: Text(
            'BMI Calculator',
            style: TextStyle(
              fontWeight: FontWeight.bold,
            ),
          ),
        ),
      ),
      body: Column(
        children: <Widget>[
          Expanded(
            child: Padding(
              padding: const EdgeInsets.fromLTRB(20.0, 10.0, 20.0, 5.0),
              child: Row(
                children: <Widget>[
                  Expanded(
                    child: ReusableContainer(
                      containerColor,
                      insideEveryCard(
                        iconForDiffCards: FontAwesomeIcons.mars,
                        textForDiffCards: 'MALE',
                      ),
                    ),
                  ),
                  SizedBox(
                    width: 5.0,
                  ),
                  Expanded(
                    child: ReusableContainer(
                        containerColor,
                        insideEveryCard(
                          iconForDiffCards: FontAwesomeIcons.venus,
                          textForDiffCards: 'FEMALE',
                        )),
                  )
                ],
              ),
            ),
          ),
          Expanded(
            child: Padding(
              padding: const EdgeInsets.fromLTRB(20.0, 8.0, 20.0, 5.0),
              child: ReusableContainer(
                  containerColor,
                  insideEveryCard(
                    iconForDiffCards: null,
                    textForDiffCards: null,
                  )),
            ),
          ),
          Expanded(
            child: Padding(
              padding: const EdgeInsets.fromLTRB(20.0, 8.0, 20.0, 18.0),
              child: Row(
                children: <Widget>[
                  Expanded(
                    child: ReusableContainer(
                      containerColor,
                      insideEveryCard(
                        iconForDiffCards: null,
                        textForDiffCards: null,
                      ),
                    ),
                  ),
                  SizedBox(
                    width: 5.0,
                  ),
                  Expanded(
                    child: ReusableContainer(
                      containerColor,
                      insideEveryCard(
                        iconForDiffCards: null,
                        textForDiffCards: null,
                      ),
                    ),
                  )
                ],
              ),
            ),
          ),
          Container(
            height: 60.0,
            width: double.infinity,
            decoration: BoxDecoration(
              color: bmiColor,
            ),
            child: Center(
              child: Text(
                'CALCULATE YOUR BMI',
                style: TextStyle(
                  fontWeight: FontWeight.bold,
                  fontSize: 18.0,
                ),
              ),
            ),
          ),
        ],
      ),
    );
  }
}

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
        Text(
          textForDiffCards,
        )
      ],
    );
  }
}

class ReusableContainer extends StatelessWidget {
  final Color colour;
  final Widget insideContainer;
  ReusableContainer(this.colour, this.insideContainer);
  @override
  Widget build(BuildContext context) {
    return Container(
      decoration: BoxDecoration(
        color: colour,
      ),
      child: insideContainer,
    );
  }
}
