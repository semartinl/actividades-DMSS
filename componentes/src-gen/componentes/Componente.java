/**
 */
package componentes;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Componente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentes.Componente#getName <em>Name</em>}</li>
 *   <li>{@link componentes.Componente#getProvides <em>Provides</em>}</li>
 *   <li>{@link componentes.Componente#getRequires <em>Requires</em>}</li>
 * </ul>
 *
 * @see componentes.ComponentesPackage#getComponente()
 * @model
 * @generated
 */
public interface Componente extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see componentes.ComponentesPackage#getComponente_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link componentes.Componente#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Provides</b></em>' containment reference list.
	 * The list contents are of type {@link componentes.ProvidedInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' containment reference list.
	 * @see componentes.ComponentesPackage#getComponente_Provides()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvidedInterface> getProvides();

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' containment reference list.
	 * The list contents are of type {@link componentes.RequiredInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' containment reference list.
	 * @see componentes.ComponentesPackage#getComponente_Requires()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredInterface> getRequires();

} // Componente
