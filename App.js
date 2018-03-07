/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import { Text, View, StyleSheet, TouchableOpacity} from 'react-native';
import ToastExample from './ToastExample';

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
  instructions: {
    textAlign: 'center',
    color: '#333333',
    marginBottom: 5,
  },
});
export default class BlinkApp extends Component {

  render() {
    return (
      <View style={styles.container}>
        <TouchableOpacity onPress={this.onPressButton}>
          <Text style={styles.instructions}>
          Click to show native Toast
          </Text>
        </TouchableOpacity>
      </View>
    );
  }
  onPressButton() {
    ToastExample.show('Test Toast', ToastExample.SHORT);
  }
}


