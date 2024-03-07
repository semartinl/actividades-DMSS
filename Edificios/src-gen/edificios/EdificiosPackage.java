/**
 */
package edificios;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edificios.EdificiosFactory
 * @model kind="package"
 * @generated
 */
public interface EdificiosPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "edificios";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/edificios";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edificios";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdificiosPackage eINSTANCE = edificios.impl.EdificiosPackageImpl.init();

	/**
	 * The meta object id for the '{@link edificios.impl.NewEClass1Impl <em>New EClass1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edificios.impl.NewEClass1Impl
	 * @see edificios.impl.EdificiosPackageImpl#getNewEClass1()
	 * @generated
	 */
	int NEW_ECLASS1 = 0;

	/**
	 * The number of structural features of the '<em>New EClass1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS1_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>New EClass1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS1_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link edificios.NewEClass1 <em>New EClass1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New EClass1</em>'.
	 * @see edificios.NewEClass1
	 * @generated
	 */
	EClass getNewEClass1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EdificiosFactory getEdificiosFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edificios.impl.NewEClass1Impl <em>New EClass1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edificios.impl.NewEClass1Impl
		 * @see edificios.impl.EdificiosPackageImpl#getNewEClass1()
		 * @generated
		 */
		EClass NEW_ECLASS1 = eINSTANCE.getNewEClass1();

	}

} //EdificiosPackage
