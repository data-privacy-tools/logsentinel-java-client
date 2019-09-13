
# GDPRResponsibleEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aboveGDPREmployeeThreshold** | **Boolean** |  |  [optional]
**address** | **String** |  |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**deleted** | **Boolean** |  |  [optional]
**dpoEmail** | **String** |  |  [optional]
**dpoName** | **String** |  |  [optional]
**dpoPhone** | **String** |  |  [optional]
**entityName** | **String** |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**legalEntityType** | [**LegalEntityTypeEnum**](#LegalEntityTypeEnum) |  |  [optional]
**legalIdentifier** | **String** |  |  [optional]
**owningOrganizationId** | [**UUID**](UUID.md) |  |  [optional]
**representativeEmail** | **String** |  |  [optional]
**representativeName** | **String** |  |  [optional]
**representativePhone** | **String** |  |  [optional]
**updated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]


<a name="LegalEntityTypeEnum"></a>
## Enum: LegalEntityTypeEnum
Name | Value
---- | -----
LEGAL_PERSON | &quot;LEGAL_PERSON&quot;
NATURAL_PERSON | &quot;NATURAL_PERSON&quot;
PUBLIC_AUTHORITY | &quot;PUBLIC_AUTHORITY&quot;



