/**
 */
package componentes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentes.Conector#getOrigen <em>Origen</em>}</li>
 *   <li>{@link componentes.Conector#getDestino <em>Destino</em>}</li>
 *   <li>{@link componentes.Conector#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see componentes.ComponentesPackage#getConector()
 * @model
 * @generated
 */
public interface Conector extends EObject {
	/**
	 * Returns the value of the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' reference.
	 * @see #setOrigen(Componente)
	 * @see componentes.ComponentesPackage#getConector_Origen()
	 * @model required="true"
	 * @generated
	 */
	Componente getOrigen();

	/**
	 * Sets the value of the '{@link componentes.Conector#getOrigen <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' reference.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(Componente value);

	/**
	 * Returns the value of the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' reference.
	 * @see #setDestino(Componente)
	 * @see componentes.ComponentesPackage#getConector_Destino()
	 * @model required="true"
	 * @generated
	 */
	Componente getDestino();

	/**
	 * Sets the value of the '{@link componentes.Conector#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(Componente value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see componentes.ComponentesPackage#getConector_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link componentes.Conector#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // Conector
