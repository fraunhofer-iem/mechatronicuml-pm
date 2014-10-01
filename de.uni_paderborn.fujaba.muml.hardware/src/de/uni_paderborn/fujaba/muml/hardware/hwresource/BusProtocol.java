/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresource;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a bus protocol used by bus media and bus ports.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.BusProtocol#getBusProtocol <em>Bus Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage#getBusProtocol()
 * @model
 * @generated
 */
public interface BusProtocol extends CommunicationProtocol {
	/**
	 * Returns the value of the '<em><b>Bus Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.hardware.hwresource.BusProtocolKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bus protocol type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bus Protocol</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.BusProtocolKind
	 * @see #setBusProtocol(BusProtocolKind)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage#getBusProtocol_BusProtocol()
	 * @model required="true"
	 * @generated
	 */
	BusProtocolKind getBusProtocol();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.BusProtocol#getBusProtocol <em>Bus Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Protocol</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.BusProtocolKind
	 * @see #getBusProtocol()
	 * @generated
	 */
	void setBusProtocol(BusProtocolKind value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (busProtocol == null) {\n\t\t\treturn busProtocol.toString();\n\t\t}\n\t\treturn super.toString();'"
	 * @generated
	 */
	String toString();

} // BusProtocol
