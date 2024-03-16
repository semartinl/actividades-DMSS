/**
 */
package componentes.impl;

import componentes.CBAPP;
import componentes.Componente;
import componentes.ComponentesPackage;
import componentes.Conector;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CBAPP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentes.impl.CBAPPImpl#getConectores <em>Conectores</em>}</li>
 *   <li>{@link componentes.impl.CBAPPImpl#getComponentes <em>Componentes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CBAPPImpl extends MinimalEObjectImpl.Container implements CBAPP {
	/**
	 * The cached value of the '{@link #getConectores() <em>Conectores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConectores()
	 * @generated
	 * @ordered
	 */
	protected EList<Conector> conectores;

	/**
	 * The cached value of the '{@link #getComponentes() <em>Componentes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentes()
	 * @generated
	 * @ordered
	 */
	protected EList<Componente> componentes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CBAPPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentesPackage.Literals.CBAPP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Conector> getConectores() {
		if (conectores == null) {
			conectores = new EObjectContainmentEList<Conector>(Conector.class, this,
					ComponentesPackage.CBAPP__CONECTORES);
		}
		return conectores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Componente> getComponentes() {
		if (componentes == null) {
			componentes = new EObjectContainmentEList<Componente>(Componente.class, this,
					ComponentesPackage.CBAPP__COMPONENTES);
		}
		return componentes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComponentesPackage.CBAPP__CONECTORES:
			return ((InternalEList<?>) getConectores()).basicRemove(otherEnd, msgs);
		case ComponentesPackage.CBAPP__COMPONENTES:
			return ((InternalEList<?>) getComponentes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComponentesPackage.CBAPP__CONECTORES:
			return getConectores();
		case ComponentesPackage.CBAPP__COMPONENTES:
			return getComponentes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ComponentesPackage.CBAPP__CONECTORES:
			getConectores().clear();
			getConectores().addAll((Collection<? extends Conector>) newValue);
			return;
		case ComponentesPackage.CBAPP__COMPONENTES:
			getComponentes().clear();
			getComponentes().addAll((Collection<? extends Componente>) newValue);
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
		case ComponentesPackage.CBAPP__CONECTORES:
			getConectores().clear();
			return;
		case ComponentesPackage.CBAPP__COMPONENTES:
			getComponentes().clear();
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
		case ComponentesPackage.CBAPP__CONECTORES:
			return conectores != null && !conectores.isEmpty();
		case ComponentesPackage.CBAPP__COMPONENTES:
			return componentes != null && !componentes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CBAPPImpl
