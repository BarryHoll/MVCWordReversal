/**
 * UI only
 */

package com.bchollywood.mvcwordrev.view;

import java.awt.event.ActionListener;
import javax.swing.*;

public class WordReversalView  extends JFrame {
	
	private JLabel inputSentenceLabel = new JLabel("Write your sentence:");
	private JTextField inputSentenceText = new JTextField(30);
	private JButton reverseButton = new JButton("Reverse");
	private JLabel reversedWordsLabel = new JLabel("Reversed Words:");
	private JTextField outReversedWordsText = new JTextField(30);
	private JLabel reversedSentenceLabel = new JLabel("Reversed Sentence:");
	private JTextField outReversedSentenceText = new JTextField(30);
	
	public WordReversalView() {
		
		JPanel wordReversalPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		
		wordReversalPanel.add(inputSentenceLabel);
		wordReversalPanel.add(inputSentenceText);
		wordReversalPanel.add(reverseButton);
		wordReversalPanel.add(reversedWordsLabel);
		wordReversalPanel.add(outReversedWordsText);
		wordReversalPanel.add(reversedSentenceLabel);
		wordReversalPanel.add(outReversedSentenceText);
		
		this.add(wordReversalPanel);
		
	}
	
	public String getInputSentence() {
		return inputSentenceText.getText();
	}
	
	public void setOutReversedWords(String revWords){
		outReversedWordsText.setText(revWords);
	}
	
	public void setOutReversedSentence(String revSentence){
		outReversedSentenceText.setText(revSentence);
	}
	
	public void addReversalListener(ActionListener listenForReverseButton){
		reverseButton.addActionListener(listenForReverseButton);
	}
	
	public void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);
	}
	
}
