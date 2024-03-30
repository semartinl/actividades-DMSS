/**
 */
package edificios;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edificios.EdificiosPackage
 * @generated
 */
public interface EdificiosFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdificiosFactory eINSTANCE = edificios.impl.EdificiosFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>New EClass1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New EClass1</em>'.
	 * @generated
	 */
	NewEClass1 createNewEClass1();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EdificiosPackage getEdificiosPackage();

} //EdificiosFactory
