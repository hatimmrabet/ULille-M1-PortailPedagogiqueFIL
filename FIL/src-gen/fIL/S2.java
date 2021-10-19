/**
 */
package fIL;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>S2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fIL.S2#getUes <em>Ues</em>}</li>
 *   <li>{@link fIL.S2#getUesoptionnelles <em>Uesoptionnelles</em>}</li>
 *   <li>{@link fIL.S2#getUesobligatoires <em>Uesobligatoires</em>}</li>
 * </ul>
 *
 * @see fIL.FILPackage#getS2()
 * @model
 * @generated
 */
public interface S2 extends EObject {

	/**
	 * Returns the value of the '<em><b>Ues</b></em>' containment reference list.
	 * The list contents are of type {@link fIL.UE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ues</em>' containment reference list.
	 * @see fIL.FILPackage#getS2_Ues()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<UE> getUes();

	/**
	 * Returns the value of the '<em><b>Uesoptionnelles</b></em>' reference list.
	 * The list contents are of type {@link fIL.UE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uesoptionnelles</em>' reference list.
	 * @see fIL.FILPackage#getS2_Uesoptionnelles()
	 * @model derived="true"
	 * @generated
	 */
	EList<UE> getUesoptionnelles();

	/**
	 * Returns the value of the '<em><b>Uesobligatoires</b></em>' reference list.
	 * The list contents are of type {@link fIL.UE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uesobligatoires</em>' reference list.
	 * @see fIL.FILPackage#getS2_Uesobligatoires()
	 * @model derived="true"
	 * @generated
	 */
	EList<UE> getUesobligatoires();
} // S2