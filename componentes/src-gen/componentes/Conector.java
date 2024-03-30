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
 *   <li>{@link componentes.Conector#getNombre <em>Nombre</em>}</li>
 *   <li>{@link componentes.Conector#getEndA <em>End A</em>}</li>
 *   <li>{@link componentes.Conector#getEndB <em>End B</em>}</li>
 * </ul>
 *
 * @see componentes.ComponentesPackage#getConector()
 * @model
 * @generated
 */
public interface Conector extends EObject {
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

	/**
	 * Returns the value of the '<em><b>End A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End A</em>' reference.
	 * @see #setEndA(ProvidedInterface)
	 * @see componentes.ComponentesPackage#getConector_EndA()
	 * @model required="true"
	 * @generated
	 */
	ProvidedInterface getEndA();

	/**
	 * Sets the value of the '{@link componentes.Conector#getEndA <em>End A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End A</em>' reference.
	 * @see #getEndA()
	 * @generated
	 */
	void setEndA(ProvidedInterface value);

	/**
	 * Returns the value of the '<em><b>End B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End B</em>' reference.
	 * @see #setEndB(RequiredInterface)
	 * @see componentes.ComponentesPackage#getConector_EndB()
	 * @model required="true"
	 * @generated
	 */
	RequiredInterface getEndB();

	/**
	 * Sets the value of the '{@link componentes.Conector#getEndB <em>End B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End B</em>' reference.
	 * @see #getEndB()
	 * @generated
	 */
	void setEndB(RequiredInterface value);

} // Conector
