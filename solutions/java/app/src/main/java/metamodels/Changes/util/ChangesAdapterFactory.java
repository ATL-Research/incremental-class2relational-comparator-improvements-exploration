/**
 */
package metamodels.Changes.util;

import metamodels.Changes.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see metamodels.Changes.ChangesPackage
 * @generated
 */
public class ChangesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ChangesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ChangesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangesSwitch<Adapter> modelSwitch =
		new ChangesSwitch<Adapter>() {
			@Override
			public Adapter caseModelChangeSet(ModelChangeSet object) {
				return createModelChangeSetAdapter();
			}
			@Override
			public Adapter caseModelChange(ModelChange object) {
				return createModelChangeAdapter();
			}
			@Override
			public Adapter caseElementaryChange(ElementaryChange object) {
				return createElementaryChangeAdapter();
			}
			@Override
			public Adapter caseChangeTransaction(ChangeTransaction object) {
				return createChangeTransactionAdapter();
			}
			@Override
			public Adapter caseCompositionChange(CompositionChange object) {
				return createCompositionChangeAdapter();
			}
			@Override
			public Adapter caseAssociationChange(AssociationChange object) {
				return createAssociationChangeAdapter();
			}
			@Override
			public Adapter caseAttributeChange(AttributeChange object) {
				return createAttributeChangeAdapter();
			}
			@Override
			public Adapter caseAssociationCollectionDeletion(AssociationCollectionDeletion object) {
				return createAssociationCollectionDeletionAdapter();
			}
			@Override
			public Adapter caseCompositionCollectionDeletion(CompositionCollectionDeletion object) {
				return createCompositionCollectionDeletionAdapter();
			}
			@Override
			public Adapter caseAttributeCollectionDeletion(AttributeCollectionDeletion object) {
				return createAttributeCollectionDeletionAdapter();
			}
			@Override
			public Adapter caseAssociationCollectionInsertion(AssociationCollectionInsertion object) {
				return createAssociationCollectionInsertionAdapter();
			}
			@Override
			public Adapter caseCompositionCollectionInsertion(CompositionCollectionInsertion object) {
				return createCompositionCollectionInsertionAdapter();
			}
			@Override
			public Adapter caseAttributeCollectionInsertion(AttributeCollectionInsertion object) {
				return createAttributeCollectionInsertionAdapter();
			}
			@Override
			public Adapter caseAssociationCollectionReset(AssociationCollectionReset object) {
				return createAssociationCollectionResetAdapter();
			}
			@Override
			public Adapter caseCompositionCollectionReset(CompositionCollectionReset object) {
				return createCompositionCollectionResetAdapter();
			}
			@Override
			public Adapter caseAttributeCollectionReset(AttributeCollectionReset object) {
				return createAttributeCollectionResetAdapter();
			}
			@Override
			public Adapter caseAssociationListDeletion(AssociationListDeletion object) {
				return createAssociationListDeletionAdapter();
			}
			@Override
			public Adapter caseCompositionListDeletion(CompositionListDeletion object) {
				return createCompositionListDeletionAdapter();
			}
			@Override
			public Adapter caseAttributeListDeletion(AttributeListDeletion object) {
				return createAttributeListDeletionAdapter();
			}
			@Override
			public Adapter caseAssociationListInsertion(AssociationListInsertion object) {
				return createAssociationListInsertionAdapter();
			}
			@Override
			public Adapter caseCompositionListInsertion(CompositionListInsertion object) {
				return createCompositionListInsertionAdapter();
			}
			@Override
			public Adapter caseAttributeListInsertion(AttributeListInsertion object) {
				return createAttributeListInsertionAdapter();
			}
			@Override
			public Adapter caseAttributePropertyChange(AttributePropertyChange object) {
				return createAttributePropertyChangeAdapter();
			}
			@Override
			public Adapter caseAssociationPropertyChange(AssociationPropertyChange object) {
				return createAssociationPropertyChangeAdapter();
			}
			@Override
			public Adapter caseCompositionPropertyChange(CompositionPropertyChange object) {
				return createCompositionPropertyChangeAdapter();
			}
			@Override
			public Adapter caseCompositionMoveIntoProperty(CompositionMoveIntoProperty object) {
				return createCompositionMoveIntoPropertyAdapter();
			}
			@Override
			public Adapter caseCompositionMoveToList(CompositionMoveToList object) {
				return createCompositionMoveToListAdapter();
			}
			@Override
			public Adapter caseCompositionMoveToCollection(CompositionMoveToCollection object) {
				return createCompositionMoveToCollectionAdapter();
			}
			@Override
			public Adapter caseOperationCall(OperationCall object) {
				return createOperationCallAdapter();
			}
			@Override
			public Adapter caseOperationArgument(OperationArgument object) {
				return createOperationArgumentAdapter();
			}
			@Override
			public Adapter caseValueArgument(ValueArgument object) {
				return createValueArgumentAdapter();
			}
			@Override
			public Adapter caseReferenceArgument(ReferenceArgument object) {
				return createReferenceArgumentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.ModelChangeSet <em>Model Change Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.ModelChangeSet
	 * @generated
	 */
	public Adapter createModelChangeSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.ModelChange <em>Model Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.ModelChange
	 * @generated
	 */
	public Adapter createModelChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.ElementaryChange <em>Elementary Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.ElementaryChange
	 * @generated
	 */
	public Adapter createElementaryChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.ChangeTransaction <em>Change Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.ChangeTransaction
	 * @generated
	 */
	public Adapter createChangeTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.CompositionChange <em>Composition Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.CompositionChange
	 * @generated
	 */
	public Adapter createCompositionChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.AssociationChange <em>Association Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.AssociationChange
	 * @generated
	 */
	public Adapter createAssociationChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.AttributeChange <em>Attribute Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.AttributeChange
	 * @generated
	 */
	public Adapter createAttributeChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.AssociationCollectionDeletion <em>Association Collection Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.AssociationCollectionDeletion
	 * @generated
	 */
	public Adapter createAssociationCollectionDeletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.CompositionCollectionDeletion <em>Composition Collection Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.CompositionCollectionDeletion
	 * @generated
	 */
	public Adapter createCompositionCollectionDeletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.AttributeCollectionDeletion <em>Attribute Collection Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.AttributeCollectionDeletion
	 * @generated
	 */
	public Adapter createAttributeCollectionDeletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.AssociationCollectionInsertion <em>Association Collection Insertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.AssociationCollectionInsertion
	 * @generated
	 */
	public Adapter createAssociationCollectionInsertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.CompositionCollectionInsertion <em>Composition Collection Insertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.CompositionCollectionInsertion
	 * @generated
	 */
	public Adapter createCompositionCollectionInsertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.AttributeCollectionInsertion <em>Attribute Collection Insertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.AttributeCollectionInsertion
	 * @generated
	 */
	public Adapter createAttributeCollectionInsertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.AssociationCollectionReset <em>Association Collection Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.AssociationCollectionReset
	 * @generated
	 */
	public Adapter createAssociationCollectionResetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.CompositionCollectionReset <em>Composition Collection Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.CompositionCollectionReset
	 * @generated
	 */
	public Adapter createCompositionCollectionResetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.AttributeCollectionReset <em>Attribute Collection Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.AttributeCollectionReset
	 * @generated
	 */
	public Adapter createAttributeCollectionResetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.AssociationListDeletion <em>Association List Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.AssociationListDeletion
	 * @generated
	 */
	public Adapter createAssociationListDeletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.CompositionListDeletion <em>Composition List Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.CompositionListDeletion
	 * @generated
	 */
	public Adapter createCompositionListDeletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.AttributeListDeletion <em>Attribute List Deletion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.AttributeListDeletion
	 * @generated
	 */
	public Adapter createAttributeListDeletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.AssociationListInsertion <em>Association List Insertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.AssociationListInsertion
	 * @generated
	 */
	public Adapter createAssociationListInsertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.CompositionListInsertion <em>Composition List Insertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.CompositionListInsertion
	 * @generated
	 */
	public Adapter createCompositionListInsertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.AttributeListInsertion <em>Attribute List Insertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.AttributeListInsertion
	 * @generated
	 */
	public Adapter createAttributeListInsertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.AttributePropertyChange <em>Attribute Property Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.AttributePropertyChange
	 * @generated
	 */
	public Adapter createAttributePropertyChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.AssociationPropertyChange <em>Association Property Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.AssociationPropertyChange
	 * @generated
	 */
	public Adapter createAssociationPropertyChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.CompositionPropertyChange <em>Composition Property Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.CompositionPropertyChange
	 * @generated
	 */
	public Adapter createCompositionPropertyChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.CompositionMoveIntoProperty <em>Composition Move Into Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.CompositionMoveIntoProperty
	 * @generated
	 */
	public Adapter createCompositionMoveIntoPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.CompositionMoveToList <em>Composition Move To List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.CompositionMoveToList
	 * @generated
	 */
	public Adapter createCompositionMoveToListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.CompositionMoveToCollection <em>Composition Move To Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.CompositionMoveToCollection
	 * @generated
	 */
	public Adapter createCompositionMoveToCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.OperationCall <em>Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.OperationCall
	 * @generated
	 */
	public Adapter createOperationCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.OperationArgument <em>Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.OperationArgument
	 * @generated
	 */
	public Adapter createOperationArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.ValueArgument <em>Value Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.ValueArgument
	 * @generated
	 */
	public Adapter createValueArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodels.Changes.ReferenceArgument <em>Reference Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodels.Changes.ReferenceArgument
	 * @generated
	 */
	public Adapter createReferenceArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ChangesAdapterFactory
