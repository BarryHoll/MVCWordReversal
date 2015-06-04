package com.bchollywood.mvcwordrev.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.bchollywood.mvcwordrev.model.WordReversalModel;
import com.bchollywood.mvcwordrev.view.WordReversalView;

/**
 * The controller is the only one
 * with access to all the information.
 * @author Barry
 *
 */

public class WordReversalController {
	
	private WordReversalView theView;
	private WordReversalModel theModel;
	
	public WordReversalController(WordReversalView theView, WordReversalModel theModel) {
		
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addReversalListener(new ReversalListener());
		
	}
	
	class ReversalListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String inputSentence = "";
			
			try{
				
				inputSentence = theView.getInputSentence();
				theModel.reverseWords(inputSentence);
				theView.setOutReversedWords(theModel.getReversedWords());
				
				theModel.reverseSentence(inputSentence);
				theView.setOutReversedSentence(theModel.getReversedSentence());
				
			} catch(Exception ex) {
				theView.displayErrorMessage("Something went horribly wrong... Sorry?");
			}
			
		}
		
	}
}
