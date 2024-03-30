/**
 */
package componentes.impl;

import componentes.ComponentesPackage;
import componentes.Conector;

import componentes.ProvidedInterface;
import componentes.RequiredInterface;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentes.impl.ConectorImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link componentes.impl.ConectorImpl#getEndA <em>End A</em>}</li>
 *   <li>{@link componentes.impl.ConectorImpl#getEndB <em>End B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConectorImpl extends MinimalEObjectImpl.Container implements Conector {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEndA() <em>End A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndA()
	 * @generated
	 * @ordered
	 */
	protected ProvidedInterface endA;

	/**
	 * The cached value of the '{@link #getEndB() <em>End B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndB()
	 * @generated
	 * @ordered
	 */
	protected RequiredInterface endB;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentesPackage.Literals.CONECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentesPackage.CONECTOR__NOMBRE, oldNombre,
					nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvidedInterface getEndA() {
		if (endA != null && endA.eIsProxy()) {
			InternalEObject oldEndA = (InternalEObject) endA;
			endA = (ProvidedInterface) eResolveProxy(oldEndA);
			if (endA != oldEndA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentesPackage.CONECTOR__END_A,
							oldEndA, endA));
			}
		}
		return endA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedInterface basicGetEndA() {
		return endA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndA(ProvidedInterface newEndA) {
		ProvidedInterface oldEndA = endA;
		endA = newEndA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentesPackage.CONECTOR__END_A, oldEndA, endA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequiredInterface getEndB() {
		if (endB != null && endB.eIsProxy()) {
			InternalEObject oldEndB = (InternalEObject) endB;
			endB = (RequiredInterface) eResolveProxy(oldEndB);
			if (endB != oldEndB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentesPackage.CONECTOR__END_B,
							oldEndB, endB));
			}
		}
		return endB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredInterface basicGetEndB() {
		return endB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndB(RequiredInterface newEndB) {
		RequiredInterface oldEndB = endB;
		endB = newEndB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentesPackage.CONECTOR__END_B, oldEndB, endB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComponentesPackage.CONECTOR__NOMBRE:
			return getNombre();
		case ComponentesPackage.CONECTOR__END_A:
			if (resolve)
				return getEndA();
			return basicGetEndA();
		case ComponentesPackage.CONECTOR__END_B:
			if (resolve)
				return getEndB();
			return basicGetEndB();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ComponentesPackage.CONECTOR__NOMBRE:
			setNombre((String) newValue);
			return;
		case ComponentesPackage.CONECTOR__END_A:
			setEndA((ProvidedInterface) newValue);
			return;
		case ComponentesPackage.CONECTOR__END_B:
			setEndB((RequiredInterface) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ComponentesPackage.CONECTOR__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case ComponentesPackage.CONECTOR__END_A:
			setEndA((ProvidedInterface) null);
			return;
		case ComponentesPackage.CONECTOR__END_B:
			setEndB((RequiredInterface) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ComponentesPackage.CONECTOR__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
		case ComponentesPackage.CONECTOR__END_A:
			return endA != null;
		case ComponentesPackage.CONECTOR__END_B:
			return endB != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //ConectorImpl
