package com.bchollywood.mvcwordrev;

import com.bchollywood.mvcwordrev.controller.WordReversalController;
import com.bchollywood.mvcwordrev.model.WordReversalModel;
import com.bchollywood.mvcwordrev.view.WordReversalView;

public class MVCWordReversal {

	public static void main(String[] args) {

		WordReversalView view = new WordReversalView();
		WordReversalModel model = new WordReversalModel();
		WordReversalController controller = new WordReversalController(view, model);
		
		view.setVisible(true);
	}

}
