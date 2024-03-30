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
	 * The meta object id for the '{@link componentes.impl.CBAPPImpl <em>CBAPP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentes.impl.CBAPPImpl
	 * @see componentes.impl.ComponentesPackageImpl#getCBAPP()
	 * @generated
	 */
	int CBAPP = 0;

	/**
	 * The feature id for the '<em><b>Conectores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CBAPP__CONECTORES = 0;

	/**
	 * The feature id for the '<em><b>Componentes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CBAPP__COMPONENTES = 1;

	/**
	 * The number of structural features of the '<em>CBAPP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CBAPP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>CBAPP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CBAPP_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTOR__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>End A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTOR__END_A = 1;

	/**
	 * The feature id for the '<em><b>End B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTOR__END_B = 2;

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
	 * The feature id for the '<em><b>Provides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTE__PROVIDES = 1;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTE__REQUIRES = 2;

	/**
	 * The number of structural features of the '<em>Componente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Componente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentes.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentes.impl.InterfaceImpl
	 * @see componentes.impl.ComponentesPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentes.impl.ProvidedInterfaceImpl <em>Provided Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentes.impl.ProvidedInterfaceImpl
	 * @see componentes.impl.ComponentesPackageImpl#getProvidedInterface()
	 * @generated
	 */
	int PROVIDED_INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE__NAME = INTERFACE__NAME;

	/**
	 * The number of structural features of the '<em>Provided Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provided Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentes.impl.RequiredInterfaceImpl <em>Required Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentes.impl.RequiredInterfaceImpl
	 * @see componentes.impl.ComponentesPackageImpl#getRequiredInterface()
	 * @generated
	 */
	int REQUIRED_INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE__NAME = INTERFACE__NAME;

	/**
	 * The number of structural features of the '<em>Required Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Required Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link componentes.CBAPP <em>CBAPP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CBAPP</em>'.
	 * @see componentes.CBAPP
	 * @generated
	 */
	EClass getCBAPP();

	/**
	 * Returns the meta object for the containment reference list '{@link componentes.CBAPP#getConectores <em>Conectores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conectores</em>'.
	 * @see componentes.CBAPP#getConectores()
	 * @see #getCBAPP()
	 * @generated
	 */
	EReference getCBAPP_Conectores();

	/**
	 * Returns the meta object for the containment reference list '{@link componentes.CBAPP#getComponentes <em>Componentes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Componentes</em>'.
	 * @see componentes.CBAPP#getComponentes()
	 * @see #getCBAPP()
	 * @generated
	 */
	EReference getCBAPP_Componentes();

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
	 * Returns the meta object for the reference '{@link componentes.Conector#getEndA <em>End A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End A</em>'.
	 * @see componentes.Conector#getEndA()
	 * @see #getConector()
	 * @generated
	 */
	EReference getConector_EndA();

	/**
	 * Returns the meta object for the reference '{@link componentes.Conector#getEndB <em>End B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End B</em>'.
	 * @see componentes.Conector#getEndB()
	 * @see #getConector()
	 * @generated
	 */
	EReference getConector_EndB();

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
	 * Returns the meta object for the containment reference list '{@link componentes.Componente#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provides</em>'.
	 * @see componentes.Componente#getProvides()
	 * @see #getComponente()
	 * @generated
	 */
	EReference getComponente_Provides();

	/**
	 * Returns the meta object for the containment reference list '{@link componentes.Componente#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requires</em>'.
	 * @see componentes.Componente#getRequires()
	 * @see #getComponente()
	 * @generated
	 */
	EReference getComponente_Requires();

	/**
	 * Returns the meta object for class '{@link componentes.ProvidedInterface <em>Provided Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Interface</em>'.
	 * @see componentes.ProvidedInterface
	 * @generated
	 */
	EClass getProvidedInterface();

	/**
	 * Returns the meta object for class '{@link componentes.RequiredInterface <em>Required Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Interface</em>'.
	 * @see componentes.RequiredInterface
	 * @generated
	 */
	EClass getRequiredInterface();

	/**
	 * Returns the meta object for class '{@link componentes.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see componentes.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link componentes.Interface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see componentes.Interface#getName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Name();

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
		 * The meta object literal for the '{@link componentes.impl.CBAPPImpl <em>CBAPP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentes.impl.CBAPPImpl
		 * @see componentes.impl.ComponentesPackageImpl#getCBAPP()
		 * @generated
		 */
		EClass CBAPP = eINSTANCE.getCBAPP();

		/**
		 * The meta object literal for the '<em><b>Conectores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CBAPP__CONECTORES = eINSTANCE.getCBAPP_Conectores();

		/**
		 * The meta object literal for the '<em><b>Componentes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CBAPP__COMPONENTES = eINSTANCE.getCBAPP_Componentes();

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
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONECTOR__NOMBRE = eINSTANCE.getConector_Nombre();

		/**
		 * The meta object literal for the '<em><b>End A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONECTOR__END_A = eINSTANCE.getConector_EndA();

		/**
		 * The meta object literal for the '<em><b>End B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONECTOR__END_B = eINSTANCE.getConector_EndB();

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

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTE__PROVIDES = eINSTANCE.getComponente_Provides();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTE__REQUIRES = eINSTANCE.getComponente_Requires();

		/**
		 * The meta object literal for the '{@link componentes.impl.ProvidedInterfaceImpl <em>Provided Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentes.impl.ProvidedInterfaceImpl
		 * @see componentes.impl.ComponentesPackageImpl#getProvidedInterface()
		 * @generated
		 */
		EClass PROVIDED_INTERFACE = eINSTANCE.getProvidedInterface();

		/**
		 * The meta object literal for the '{@link componentes.impl.RequiredInterfaceImpl <em>Required Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentes.impl.RequiredInterfaceImpl
		 * @see componentes.impl.ComponentesPackageImpl#getRequiredInterface()
		 * @generated
		 */
		EClass REQUIRED_INTERFACE = eINSTANCE.getRequiredInterface();

		/**
		 * The meta object literal for the '{@link componentes.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentes.impl.InterfaceImpl
		 * @see componentes.impl.ComponentesPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

	}

} //ComponentesPackage
