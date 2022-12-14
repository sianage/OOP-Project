package userinterface;

import impresario.IModel;

//==============================================================================
public class ViewFactory {

	public static View createView(String viewName, IModel model)
	{
		if(viewName.equals("LibrarianView") == true)
		{
			return new LibrarianView(model);
		}
		else if(viewName.equals("TransactionChoiceView") == true)
		{
			return new TransactionChoiceView(model);
		}
		else if(viewName.equals("WorkerView") == true)
		{
			return new WorkerView(model);
		}
		else if(viewName.equals("StudentView") == true)
		{
			return new AddStudentBorrowerView(model);
		}
		else if(viewName.equals("BookView") == true)
		{
			return new BookView(model);
		}
		else if(viewName.equals("SearchWorkerView") == true)
		{
			return new SearchWorkersView(model);
		}
		else if(viewName.equals("WorkerCollectionView") == true)
		{
			return new WorkerCollectionView(model);
		}

		else if(viewName.equals("ModifyWorkerView") == true)
		{
			return new ModifyWorkerView(model);
		}
		else if(viewName.equals("DeleteWorkerView") == true)
		{
			return new DeleteWorkerView(model);
		}
		else if(viewName.equals("SearchBookView") == true)
		{
			return new SearchBooksView(model);
		}
		else if(viewName.equals("ModifyBookView") == true)
		{
			return new ModifyBookView(model);
		}
		else if(viewName.equals("DeleteBookView") == true)
		{
			return new DeleteBookView(model);
		}
		else if(viewName.equals("BookCollectionView") == true)
		{
			return new BookCollectionView(model);
		}
		else if(viewName.equals("SearchStudentView") == true)
		{
			return new SearchStudentsView(model);
		}
		else if(viewName.equals("StudentCollectionView") == true)
		{
			return new StudentCollectionView(model);
		}
		else if(viewName.equals("ModifyStudentView") == true)
		{
			return new ModifyStudentView(model);
		}
		else if(viewName.equals("DeleteStudentView") == true)
		{
			return new DeleteStudentView(model);
		}
		else if(viewName.equals("DelCheck"))
		{
			return new DelinquencyCheckCompleteView(model);
		}
		else if(viewName.equals("NoDel")){
			return new NoStudentDelinquentView(model);
		}
		else if(viewName.equals("CheckoutBook") == true)
		{
			return new coSearchStudentView(model);
		}
		else if(viewName.equals("CheckInBook") == true)
		{
			return new CheckInView(model);
		}
		else if(viewName.equals("RentBook") == true)
		{
			return new rentalView(model);
		}
		else
			return null;
	}


	/*
	public static Vector createVectorView(String viewName, IModel model)
	{
		if(viewName.equals("SOME VIEW NAME") == true)
		{
			//return [A NEW VECTOR VIEW OF THAT NAME TYPE]
		}
		else
			return null;
	}
	*/

}