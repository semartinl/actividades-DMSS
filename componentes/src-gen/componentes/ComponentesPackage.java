/**
 */
package componentes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see componentes.ComponentesFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "componentes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/componentes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "componentes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentesPackage eINSTANCE = componentes.impl.ComponentesPackageImpl.init();

	/**
	 * The meta object id for the '{@link componentes.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentes.impl.RootImpl
	 * @see componentes.impl.ComponentesPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Conectores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__CONECTORES = 0;

	/**
	 * The feature id for the '<em><b>Componentes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__COMPONENTES = 1;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentes.impl.ConectorImpl <em>Conector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentes.impl.ConectorImpl
	 * @see componentes.impl.ComponentesPackageImpl#getConector()
	 * @generated
	 */
	int CONECTOR = 1;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTOR__ORIGEN = 0;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTOR__DESTINO = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTOR__NOMBRE = 2;

	/**
	 * The number of structural features of the '<em>Conector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Conector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentes.impl.ComponenteImpl <em>Componente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentes.impl.ComponenteImpl
	 * @see componentes.impl.ComponentesPackageImpl#getComponente()
	 * @generated
	 */
	int COMPONENTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Componente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Componente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link componentes.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see componentes.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link componentes.Root#getConectores <em>Conectores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conectores</em>'.
	 * @see componentes.Root#getConectores()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Conectores();

	/**
	 * Returns the meta object for the containment reference list '{@link componentes.Root#getComponentes <em>Componentes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Componentes</em>'.
	 * @see componentes.Root#getComponentes()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Componentes();

	/**
	 * Returns the meta object for class '{@link componentes.Conector <em>Conector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conector</em>'.
	 * @see componentes.Conector
	 * @generated
	 */
	EClass getConector();

	/**
	 * Returns the meta object for the reference '{@link componentes.Conector#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen</em>'.
	 * @see componentes.Conector#getOrigen()
	 * @see #getConector()
	 * @generated
	 */
	EReference getConector_Origen();

	/**
	 * Returns the meta object for the reference '{@link componentes.Conector#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see componentes.Conector#getDestino()
	 * @see #getConector()
	 * @generated
	 */
	EReference getConector_Destino();

	/**
	 * Returns the meta object for the attribute '{@link componentes.Conector#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see componentes.Conector#getNombre()
	 * @see #getConector()
	 * @generated
	 */
	EAttribute getConector_Nombre();

	/**
	 * Returns the meta object for class '{@link componentes.Componente <em>Componente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Componente</em>'.
	 * @see componentes.Componente
	 * @generated
	 */
	EClass getComponente();

	/**
	 * Returns the meta object for the attribute '{@link componentes.Componente#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see componentes.Componente#getName()
	 * @see #getComponente()
	 * @generated
	 */
	EAttribute getComponente_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentesFactory getComponentesFactory();

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
		 * The meta object literal for the '{@link componentes.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentes.impl.RootImpl
		 * @see componentes.impl.ComponentesPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Conectores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__CONECTORES = eINSTANCE.getRoot_Conectores();

		/**
		 * The meta object literal for the '<em><b>Componentes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__COMPONENTES = eINSTANCE.getRoot_Componentes();

		/**
		 * The meta object literal for the '{@link componentes.impl.ConectorImpl <em>Conector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentes.impl.ConectorImpl
		 * @see componentes.impl.ComponentesPackageImpl#getConector()
		 * @generated
		 */
		EClass CONECTOR = eINSTANCE.getConector();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONECTOR__ORIGEN = eINSTANCE.getConector_Origen();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONECTOR__DESTINO = eINSTANCE.getConector_Destino();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONECTOR__NOMBRE = eINSTANCE.getConector_Nombre();

		/**
		 * The meta object literal for the '{@link componentes.impl.ComponenteImpl <em>Componente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentes.impl.ComponenteImpl
		 * @see componentes.impl.ComponentesPackageImpl#getComponente()
		 * @generated
		 */
		EClass COMPONENTE = eINSTANCE.getComponente();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENTE__NAME = eINSTANCE.getComponente_Name();

	}

} //ComponentesPackage
