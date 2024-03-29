/**
 */
package componentes.impl;

import componentes.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentesFactoryImpl extends EFactoryImpl implements ComponentesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentesFactory init() {
		try {
			ComponentesFactory theComponentesFactory = (ComponentesFactory) EPackage.Registry.INSTANCE
					.getEFactory(ComponentesPackage.eNS_URI);
			if (theComponentesFactory != null) {
				return theComponentesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ComponentesPackage.CBAPP:
			return createCBAPP();
		case ComponentesPackage.CONECTOR:
			return createConector();
		case ComponentesPackage.COMPONENTE:
			return createComponente();
		case ComponentesPackage.PROVIDED_INTERFACE:
			return createProvidedInterface();
		case ComponentesPackage.REQUIRED_INTERFACE:
			return createRequiredInterface();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CBAPP createCBAPP() {
		CBAPPImpl cbapp = new CBAPPImpl();
		return cbapp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conector createConector() {
		ConectorImpl conector = new ConectorImpl();
		return conector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Componente createComponente() {
		ComponenteImpl componente = new ComponenteImpl();
		return componente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvidedInterface createProvidedInterface() {
		ProvidedInterfaceImpl providedInterface = new ProvidedInterfaceImpl();
		return providedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequiredInterface createRequiredInterface() {
		RequiredInterfaceImpl requiredInterface = new RequiredInterfaceImpl();
		return requiredInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentesPackage getComponentesPackage() {
		return (ComponentesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentesPackage getPackage() {
		return ComponentesPackage.eINSTANCE;
	}

} //ComponentesFactoryImpl
