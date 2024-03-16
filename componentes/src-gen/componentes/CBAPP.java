/**
 */
package componentes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CBAPP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentes.CBAPP#getConectores <em>Conectores</em>}</li>
 *   <li>{@link componentes.CBAPP#getComponentes <em>Componentes</em>}</li>
 * </ul>
 *
 * @see componentes.ComponentesPackage#getCBAPP()
 * @model
 * @generated
 */
public interface CBAPP extends EObject {
	/**
	 * Returns the value of the '<em><b>Conectores</b></em>' containment reference list.
	 * The list contents are of type {@link componentes.Conector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conectores</em>' containment reference list.
	 * @see componentes.ComponentesPackage#getCBAPP_Conectores()
	 * @model containment="true"
	 * @generated
	 */
	EList<Conector> getConectores();

	/**
	 * Returns the value of the '<em><b>Componentes</b></em>' containment reference list.
	 * The list contents are of type {@link componentes.Componente}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Componentes</em>' containment reference list.
	 * @see componentes.ComponentesPackage#getCBAPP_Componentes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Componente> getComponentes();

} // CBAPP
